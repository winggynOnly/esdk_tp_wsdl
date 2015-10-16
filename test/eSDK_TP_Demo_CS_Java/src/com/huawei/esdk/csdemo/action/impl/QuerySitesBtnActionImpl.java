package com.huawei.esdk.csdemo.action.impl;

import java.util.List;
import com.huawei.esdk.csdemo.action.DemoAction;
import com.huawei.esdk.csdemo.common.DemoException;
import com.huawei.esdk.csdemo.common.ServiceFactory;
import com.huawei.esdk.csdemo.convert.QuerySitesServiceConvert;
import com.huawei.esdk.tp.professional.local.authentication.AuthorizeServiceEx;
import com.huawei.esdk.tp.professional.local.bean.QueryConfigEx;
import com.huawei.esdk.tp.professional.local.bean.TPSDKResponseWithPageEx;
import com.huawei.esdk.tp.professional.local.bean.TerminalInfoEx;
import com.huawei.esdk.tp.professional.local.impl.utils.PropertiesUtils;
import com.huawei.esdk.tp.professional.local.site.SiteServiceEx;

public class QuerySitesBtnActionImpl implements DemoAction
{
    @Override
    public void executeNativeMethod()
    {
        //初始化会议接口服务，该服务中包含会议管理的相关接口
        SiteServiceEx siteServiceEx = ServiceFactory.getInstance().getSiteServiceEx();
        //初始化鉴权接口服务，该服务中包含登录，登出的相关接口
        AuthorizeServiceEx authorizeServiceEx = ServiceFactory.getInstance().getAuthorizeServiceEx();
        
        //设置入参
        QueryConfigEx queryConfig = new QueryConfigEx();
        
        //从面板中拿到所有参数
        try
        {
            QuerySitesServiceConvert.getParametersFromFrame(queryConfig);
        }
        catch (DemoException e)
        {
            //界面上输入参数类型错误时，显示错误信息
            QuerySitesServiceConvert.showConvertErrInfo(e.getErrInfo());
            return;
        }
        
        //登录
        Integer loginCode = authorizeServiceEx.login(PropertiesUtils.getValue("userName"),
            PropertiesUtils.getValue("password"));
        if(0 != loginCode)
        {
            QuerySitesServiceConvert.showloginErrCode(loginCode);
            return;
        }
        
        //返回查询会场结果，result包含错误码及查询会场信息
        TPSDKResponseWithPageEx<List<TerminalInfoEx>> result = siteServiceEx.querySitesInfoEx(queryConfig);
        
        //把返回结果渲染到面板中
        QuerySitesServiceConvert.showResultInFrame(result);
        
        //登出
        authorizeServiceEx.logout();
    }
}
