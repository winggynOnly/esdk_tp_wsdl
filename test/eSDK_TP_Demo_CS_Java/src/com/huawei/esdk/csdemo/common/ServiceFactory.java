package com.huawei.esdk.csdemo.common;

import com.huawei.esdk.tp.professional.local.ServiceFactoryEx;
import com.huawei.esdk.tp.professional.local.authentication.AuthorizeServiceEx;
import com.huawei.esdk.tp.professional.local.conference.ConferenceServiceEx;
import com.huawei.esdk.tp.professional.local.site.SiteServiceEx;

public class ServiceFactory
{
    
    // native服务单例
    private static ServiceFactory instance;
    
    //会议模块服务接口
    private ConferenceServiceEx conferenceServiceEx;
    
    //会场模块服务接口
    private SiteServiceEx siteServiceEx;
    
    //鉴权模块服务接口
    private AuthorizeServiceEx authorizeServiceEx;
    
    private ServiceFactory()
    {
        // 从native包中ServiceFactoryEx类中获取相应的服务 
        conferenceServiceEx = ServiceFactoryEx.getService(ConferenceServiceEx.class);
        siteServiceEx = ServiceFactoryEx.getService(SiteServiceEx.class);
        authorizeServiceEx = ServiceFactoryEx.getService(AuthorizeServiceEx.class);
    }
    
    //获取native服务单例
    public static ServiceFactory getInstance()
    {
        if (null == instance)
        {
            instance = new ServiceFactory();
        }
        return instance;
    }
    
    public ConferenceServiceEx getConferenceServiceEx()
    {
        return conferenceServiceEx;
    }
    
    public SiteServiceEx getSiteServiceEx()
    {
        return siteServiceEx;
    }
    
    public AuthorizeServiceEx getAuthorizeServiceEx()
    {
        return authorizeServiceEx;
    }
}
