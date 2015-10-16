package com.huawei.esdk.csdemo.action.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.log4j.Logger;
import com.huawei.esdk.csdemo.action.DemoAction;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.convert.EditConfServiceConvert;
import com.huawei.esdk.csdemo.soap.impl.autogen.Authenticate;
import com.huawei.esdk.csdemo.soap.impl.autogen.AuthenticateResponse;
import com.huawei.esdk.csdemo.soap.impl.autogen.EditScheduledConfEx;
import com.huawei.esdk.csdemo.soap.impl.autogen.EditScheduledConfExResponse;
import com.huawei.esdk.csdemo.soap.impl.autogen.LoginRequest;
import com.huawei.esdk.csdemo.soap.impl.autogen.LoginRequestResponse;
import com.huawei.esdk.csdemo.soap.impl.autogen.Logout;
import com.huawei.esdk.csdemo.soap.impl.autogen.LogoutResponse;
import com.huawei.esdk.csdemo.soap.impl.autogen.TPCommon;
import com.huawei.esdk.csdemo.soap.impl.autogen.TPProfessionalConfMgr;
import com.huawei.esdk.csdemo.soap.impl.keygen.GetPublicKey;
import com.huawei.esdk.csdemo.soap.impl.keygen.GetPublicKeyResponse;
import com.huawei.esdk.csdemo.soap.impl.keygen.PlatformKeyMgr;
import com.huawei.esdk.csdemo.soap.impl.keygen.SetSecretKey;
import com.huawei.esdk.csdemo.soap.impl.keygen.SetSecretKeyResponse;
import com.huawei.esdk.csdemo.soap.impl.utils.AES128Utils;
import com.huawei.esdk.csdemo.soap.impl.utils.Base64Utils;
import com.huawei.esdk.csdemo.soap.impl.utils.ClientProvider;
import com.huawei.esdk.csdemo.soap.impl.utils.RSA2048Utils;
import com.huawei.esdk.csdemo.soap.impl.utils.StringUtils;


public class EditScheduleConfBtnActionImpl implements DemoAction
{
    /**
     * 登录鉴权
     */
    private TPCommon tpCommon = (TPCommon)ClientProvider.getClient(TPCommon.class);
    
    /**
     * 会议管理
     */
    private TPProfessionalConfMgr tpProfessionalConfMgr =
        (TPProfessionalConfMgr)ClientProvider.getClient(TPProfessionalConfMgr.class);
    
    /**
     * 密钥协商
     */
    private PlatformKeyMgr platformKeyMgr = (PlatformKeyMgr)ClientProvider.getClient(PlatformKeyMgr.class);
    
    /**
     * log日志对象
     */
    private static final Logger LOGGER = Logger.getLogger(EditScheduleConfBtnActionImpl.class);
    
    @Override
    public void executeNativeMethod()
    {

        //设置入参
        com.huawei.esdk.csdemo.soap.impl.autogen.ConferenceInfoEx conferenceInfo =
            new com.huawei.esdk.csdemo.soap.impl.autogen.ConferenceInfoEx();
        
        //从面板中拿到所有参数
        try
        {
            EditConfServiceConvert.getParametersFromConferenceInfoFrame(conferenceInfo);
        }
        catch (DemoException e)
        {
            //界面上输入参数类型错误时，显示错误信息
            EditConfServiceConvert.showConvertErrInfo(e.getErrInfo());
            return;
        }
        
        //登录
        Integer loginCode = login();
        if(0 != loginCode)
        {
            EditConfServiceConvert.showloginErrCode(loginCode);
            return;
        }

        //AES128密钥协商，用于对传输信息中的敏感数据加密
        aes128_consulted();
        
        //加密敏感字段
        if (null != conferenceInfo.getPassword() &&
            !conferenceInfo.getPassword().trim().isEmpty())
        {
            conferenceInfo.setPassword(AES128Utils.encryptPwd(
                conferenceInfo.getPassword()));
        }
        
        if (null != conferenceInfo.getChairmanPassword() &&
            !conferenceInfo.getChairmanPassword().trim().isEmpty())
        {
            conferenceInfo.setChairmanPassword(AES128Utils.encryptPwd(
                conferenceInfo.getChairmanPassword()));
        }

        //返回编辑已预约的会议结果，result包含错误码及编辑已预约的会议信息
        EditScheduledConfEx param = new EditScheduledConfEx();
        param.setEditConf(conferenceInfo);
        EditScheduledConfExResponse result = 
            tpProfessionalConfMgr.editScheduledConfEx(param);
        
        //把返回结果渲染到面板中
        EditConfServiceConvert.showResultInFrame(result);
        
        //登出
        logout();
    }
    
    /**
     * 该方法用于登录eSDK，相当于native中的login方法，
     * 实际为 soap 接口 loginRequest和authenticate的复合
     * 用于用户登录
     * 
     */
    public Integer login()
    {
        LoginRequestResponse loginRequestResponse = loginRequest();
        
        if (0 == loginRequestResponse.getResultCode())
        {
            return authenticate(loginRequestResponse);
        }
        else
        {
            return loginRequestResponse.getResultCode();
        }
        
    }
    
    /**
     * 该方法用于登出eSDK
     * 
     */
    public Integer logout()
    {
        LogoutResponse logoutResponse = tpCommon.logout(new Logout());
        int resultCode = logoutResponse.getResultCode();
        if (0 != resultCode)
        {
            LOGGER.info("Edit scheduled conference due to logout failed, errorCode is : " + resultCode); 
        }
        return resultCode;
    }
    
    /**
     * 登录方法
     * 用于用户登录请求
     * 
     */
    private LoginRequestResponse loginRequest()
    {
        // 获取参数
        String userName = com.huawei.esdk.csdemo.soap.impl.utils.PropertiesUtils.getValue("userName");
        String clientType = "API";
        Integer version = 2;
        
        // 拼装登录接口
        LoginRequest loginRequest = new LoginRequest();
        
        loginRequest.setUserName(userName);
        loginRequest.setClientType(clientType);
        loginRequest.setVersion(version);
        
        // 调用登录接口
        LoginRequestResponse loginRequestResponse = new LoginRequestResponse();
        loginRequestResponse = tpCommon.loginRequest(loginRequest);
        
        return loginRequestResponse;
    }
    
    /**
     * 鉴权方法
     * 用于认证会话
     * 
     */
    private Integer authenticate(LoginRequestResponse loginRequestResponse)
    {
        // 获取参数
        String password = com.huawei.esdk.csdemo.soap.impl.utils.PropertiesUtils.getValue("password");

        String randomkey = Base64Utils.encode(loginRequestResponse.getRandomSequence());
        String pwd = getEncryptPassword((randomkey == null) ? "" : randomkey, password);
        
        byte[] encryptPassword = Base64Utils.getFromBASE64((pwd == null) ? "" : pwd);
        
        
        // 拼装鉴权接口
        Authenticate authenticate = new Authenticate();
        authenticate.setEncryptPassword(encryptPassword);
        
        // 调用鉴权接口
        AuthenticateResponse authenticateResponse = new AuthenticateResponse();
        authenticateResponse = tpCommon.authenticate(authenticate);
        
        // 鉴权失败，返回给页面
        Integer resultCode = authenticateResponse.getResultCode();
        if (0 != resultCode)
        {
            LOGGER.info("Edit scheduled conference failed due to authenticate failed, errorCode is : " + resultCode);
        }
        
        return resultCode;
    }
    
    /**
     * 加密方法
     * 用于加密鉴权时传输的密码
     * 
     */
    private String getEncryptPassword(String randomkey, String key)
    {
        if ((StringUtils.isEmpty(key)) || (StringUtils.isEmpty(randomkey)))
        {
            return null;
        }
        
        String ep = null;
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            md.update(key.getBytes());
            byte[] encryptPassword = md.digest();
            
            StringBuilder sBuilder = new StringBuilder();
            sBuilder.append(AES128Utils.byte2Hex(encryptPassword));
            String password = sBuilder.toString();
            
            sBuilder = new StringBuilder();
            
            sBuilder.append(AES128Utils.byte2Hex(Base64Utils.getFromBASE64(randomkey)));
            password = password + sBuilder.toString();
            
            md.update(password.getBytes());
            encryptPassword = md.digest();
            
            ep = Base64Utils.encode(encryptPassword);
        }
        catch (NoSuchAlgorithmException e)
        {
            LOGGER.error("Exception happened in getEncryptPassword()", e);
        }
        return ep;
    }
    
    /**
     * 密钥协商方法
     * soap 接口 getPublicKey和setSecretkey的复合
     * 在登录成功之后调用
     */
    public Integer aes128_consulted()
    {
        // 获取公钥
        Integer publicKey = getPublicKey();
        
        if (0 == publicKey)
        {
            Integer secretKey = setSecretkey();
            return secretKey;
        }
        else
        {
            return publicKey;
        }
    }
    
    /**
     * 密钥方法
     * 用于获取公钥
     *
     */
    private Integer getPublicKey()
    {
        // 定义返回结果
        int resultCode;
        
        GetPublicKey publicKeyParam = new GetPublicKey();
        publicKeyParam.setSecretType("RSA2048");
        
        GetPublicKeyResponse publicKeyResponse = platformKeyMgr.getPublicKey(publicKeyParam);
        resultCode = publicKeyResponse.getResultCode();
        
        if (0 != resultCode)
        {
            LOGGER.info("Edit scheduled conference failed due to getPublicKey failed, errorCode is : " + resultCode);
        }
        
        // 将公钥设置到RSA2048Utils类里
        RSA2048Utils.setPublicKey(publicKeyResponse.getPublicKey());
        
        return resultCode;
    }
    
    /**
     * 密钥方法
     * 用于进行密钥协商
     * 
     */
    private Integer setSecretkey()
    {
        // 定义返回结果
        int resultCode;
        
        // 密钥协商
        byte[] secretKey = AES128Utils.getBT_KEY();
        byte[] iv = AES128Utils.getBT_IV();
        
        // 使用公钥来加密工作密钥和初始向量
        String secretKeyStr = null;
        String ivStr = null;
        
        try
        {
            secretKeyStr = Base64Utils.encode(RSA2048Utils.encode(AES128Utils.byte2Hex(secretKey).getBytes("UTF-8")));
            ivStr = Base64Utils.encode(RSA2048Utils.encode(AES128Utils.byte2Hex(iv).getBytes("UTF-8")));
        }
        catch (Exception e)
        {
            LOGGER.info("failed to setSecretKey");
        }
        
        SetSecretKey setSecretKeyParam = new SetSecretKey();
        
        setSecretKeyParam.setSecretType("AES128");
        setSecretKeyParam.setSecretKey(secretKeyStr);
        setSecretKeyParam.setIv(ivStr);
        
        SetSecretKeyResponse setSecretKeyResponse = platformKeyMgr.setSecretKey(setSecretKeyParam);
        resultCode = setSecretKeyResponse.getResultCode();
        
        if (0 != resultCode)
        {
            LOGGER.info("Edit scheduled conference failed due to setSecretKey failed, errorCode is : " + resultCode);
        }
        
        return resultCode;
    }
}
