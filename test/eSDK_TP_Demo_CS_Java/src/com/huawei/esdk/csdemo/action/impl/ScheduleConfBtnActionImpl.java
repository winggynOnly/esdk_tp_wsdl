package com.huawei.esdk.csdemo.action.impl;

import com.huawei.esdk.csdemo.action.DemoAction;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.ServiceFactory;
import com.huawei.esdk.csdemo.convert.ScheduleConfServiceConvert;
import com.huawei.esdk.tp.professional.local.authentication.AuthorizeServiceEx;
import com.huawei.esdk.tp.professional.local.bean.ConferenceInfoEx;
import com.huawei.esdk.tp.professional.local.bean.TPSDKResponseEx;
import com.huawei.esdk.tp.professional.local.conference.ConferenceServiceEx;
import com.huawei.esdk.tp.professional.local.impl.utils.PropertiesUtils;

public class ScheduleConfBtnActionImpl implements DemoAction
{
    @Override
    public void executeNativeMethod()
    {
        //初始化会议接口服务，该服务中包含会议管理的相关接口
        ConferenceServiceEx conferenceServiceEx = ServiceFactory.getInstance().getConferenceServiceEx();
        //初始化鉴权接口服务，该服务中包含登录，登出的相关接口
        AuthorizeServiceEx authorizeServiceEx = ServiceFactory.getInstance().getAuthorizeServiceEx();
        
        //设置入参
        ConferenceInfoEx conferenceInfo = new ConferenceInfoEx();
        
        //从面板中拿到所有参数
        try
        {
            ScheduleConfServiceConvert.getParametersFromConferenceInfoFrame(conferenceInfo);
        }
        catch (DemoException e)
        {
            //界面上输入参数类型错误时，显示错误信息
            ScheduleConfServiceConvert.showConvertErrInfo(e.getErrInfo());
            return;
        }
        
        //登录
        Integer loginCode = authorizeServiceEx.login(PropertiesUtils.getValue("userName"),
            PropertiesUtils.getValue("password"));
        if(0 != loginCode)
        {
            ScheduleConfServiceConvert.showloginErrCode(loginCode);
            return;
        }

        //返回创建会议结果，result包含错误码及创建会议信息
        TPSDKResponseEx<ConferenceInfoEx> result = conferenceServiceEx.scheduleConfEx(conferenceInfo);
        
        //把返回结果渲染到面板中
        ScheduleConfServiceConvert.showResultInFrame(result);
        
        //登出
        authorizeServiceEx.logout();
    }
}
