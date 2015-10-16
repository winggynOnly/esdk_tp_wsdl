package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.10
 * 2015-01-27T19:31:56.829+08:00
 * Generated source version: 2.6.10
 * 
 */
@WebService(targetNamespace = "http://smc.huawei.com/", name = "TPProfessional.ConfCtr")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TPProfessionalConfCtr {

    @WebResult(name = "setConfSiteVolumeExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setConfSiteVolumeEx")
    public SetConfSiteVolumeExResponse setConfSiteVolumeEx(
        @WebParam(partName = "parameters", name = "setConfSiteVolumeEx", targetNamespace = "http://smc.huawei.com/")
        SetConfSiteVolumeEx parameters
    );

    @WebResult(name = "unlockPresentationExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/unlockPresentationEx")
    public UnlockPresentationExResponse unlockPresentationEx(
        @WebParam(partName = "parameters", name = "unlockPresentationEx", targetNamespace = "http://smc.huawei.com/")
        UnlockPresentationEx parameters
    );

    @WebResult(name = "setBroadcastContinuousPresenceExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setBroadcastContinuousPresenceEx")
    public SetBroadcastContinuousPresenceExResponse setBroadcastContinuousPresenceEx(
        @WebParam(partName = "parameters", name = "setBroadcastContinuousPresenceEx", targetNamespace = "http://smc.huawei.com/")
        SetBroadcastContinuousPresenceEx parameters
    );

    @WebResult(name = "setSitesQuietExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setSitesQuietEx")
    public SetSitesQuietExResponse setSitesQuietEx(
        @WebParam(partName = "parameters", name = "setSitesQuietEx", targetNamespace = "http://smc.huawei.com/")
        SetSitesQuietEx parameters
    );

    @WebResult(name = "hideConfSiteLocalVideoExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/hideConfSiteLocalVideoEx")
    public HideConfSiteLocalVideoExResponse hideConfSiteLocalVideoEx(
        @WebParam(partName = "parameters", name = "hideConfSiteLocalVideoEx", targetNamespace = "http://smc.huawei.com/")
        HideConfSiteLocalVideoEx parameters
    );

    @WebResult(name = "setAudioSwitchExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setAudioSwitchEx")
    public SetAudioSwitchExResponse setAudioSwitchEx(
        @WebParam(partName = "parameters", name = "setAudioSwitchEx", targetNamespace = "http://smc.huawei.com/")
        SetAudioSwitchEx parameters
    );

    @WebResult(name = "setFloorExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setFloorEx")
    public SetFloorExResponse setFloorEx(
        @WebParam(partName = "parameters", name = "setFloorEx", targetNamespace = "http://smc.huawei.com/")
        SetFloorEx parameters
    );

    @WebResult(name = "setBroadcastSiteExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setBroadcastSiteEx")
    public SetBroadcastSiteExResponse setBroadcastSiteEx(
        @WebParam(partName = "parameters", name = "setBroadcastSiteEx", targetNamespace = "http://smc.huawei.com/")
        SetBroadcastSiteEx parameters
    );

    @WebResult(name = "lockPresentationExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/lockPresentationEx")
    public LockPresentationExResponse lockPresentationEx(
        @WebParam(partName = "parameters", name = "lockPresentationEx", targetNamespace = "http://smc.huawei.com/")
        LockPresentationEx parameters
    );

    @WebResult(name = "setContinuousPresenceExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setContinuousPresenceEx")
    public SetContinuousPresenceExResponse setContinuousPresenceEx(
        @WebParam(partName = "parameters", name = "setContinuousPresenceEx", targetNamespace = "http://smc.huawei.com/")
        SetContinuousPresenceEx parameters
    );

    @WebResult(name = "setSitesMuteExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setSitesMuteEx")
    public SetSitesMuteExResponse setSitesMuteEx(
        @WebParam(partName = "parameters", name = "setSitesMuteEx", targetNamespace = "http://smc.huawei.com/")
        SetSitesMuteEx parameters
    );

    @WebResult(name = "setVideoSourceExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/setVideoSourceEx")
    public SetVideoSourceExResponse setVideoSourceEx(
        @WebParam(partName = "parameters", name = "setVideoSourceEx", targetNamespace = "http://smc.huawei.com/")
        SetVideoSourceEx parameters
    );

    @WebResult(name = "displayConfSiteLocalVideoExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/displayConfSiteLocalVideoEx")
    public DisplayConfSiteLocalVideoExResponse displayConfSiteLocalVideoEx(
        @WebParam(partName = "parameters", name = "displayConfSiteLocalVideoEx", targetNamespace = "http://smc.huawei.com/")
        DisplayConfSiteLocalVideoEx parameters
    );

    @WebResult(name = "requestConfChairExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/requestConfChairEx")
    public RequestConfChairExResponse requestConfChairEx(
        @WebParam(partName = "parameters", name = "requestConfChairEx", targetNamespace = "http://smc.huawei.com/")
        RequestConfChairEx parameters
    );

    @WebResult(name = "releaseConfChairExResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(action = "http://smc.huawei.com/releaseConfChairEx")
    public ReleaseConfChairExResponse releaseConfChairEx(
        @WebParam(partName = "parameters", name = "releaseConfChairEx", targetNamespace = "http://smc.huawei.com/")
        ReleaseConfChairEx parameters
    );
}