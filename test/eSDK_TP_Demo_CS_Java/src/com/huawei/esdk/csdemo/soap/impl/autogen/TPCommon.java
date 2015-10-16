package com.huawei.esdk.csdemo.soap.impl.autogen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.10
 * 2015-01-27T19:31:56.804+08:00
 * Generated source version: 2.6.10
 * 
 */
@WebService(targetNamespace = "http://smc.huawei.com/", name = "TP.Common")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TPCommon {

    @WebResult(name = "LogoutResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(operationName = "Logout", action = "http://smc.huawei.com/Logout")
    public LogoutResponse logout(
        @WebParam(partName = "parameters", name = "Logout", targetNamespace = "http://smc.huawei.com/")
        Logout parameters
    );

    @WebResult(name = "KeepAliveResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(operationName = "KeepAlive", action = "http://smc.huawei.com/KeepAlive")
    public KeepAliveResponse keepAlive(
        @WebParam(partName = "parameters", name = "KeepAlive", targetNamespace = "http://smc.huawei.com/")
        KeepAlive parameters
    );

    @WebResult(name = "AuthenticateResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(operationName = "Authenticate", action = "http://smc.huawei.com/Authenticate")
    public AuthenticateResponse authenticate(
        @WebParam(partName = "parameters", name = "Authenticate", targetNamespace = "http://smc.huawei.com/")
        Authenticate parameters
    );

    @WebResult(name = "LoginRequestResponse", targetNamespace = "http://smc.huawei.com/", partName = "parameters")
    @WebMethod(operationName = "LoginRequest", action = "http://smc.huawei.com/LoginRequest")
    public LoginRequestResponse loginRequest(
        @WebParam(partName = "parameters", name = "LoginRequest", targetNamespace = "http://smc.huawei.com/")
        LoginRequest parameters
    );
}
