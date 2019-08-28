package com.teamdevsolution.services;

import com.teamdevsolution.dto.*;
import com.teamdevsolution.exception.InputOuputException;
import com.teamdevsolution.exception.KeyManagementException;
import com.teamdevsolution.exception.NoSuchAlgorithmException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService(name = "WebSoapService", targetNamespace = "http://services.apigwom.teamdevsolution.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface WebSoapService {

    @WebMethod(action = "TcheckBal")
    public TcheckBalResponse TcheckBal(@WebParam(name = "TcheckBal", targetNamespace = "")TcheckBal tcheckBal) throws InputOuputException,NoSuchAlgorithmException,KeyManagementException;

    @WebMethod(action = "doCheckTrans")
    public DoCheckTransResponse doCheckTrans(@WebParam(name = "doCheckTrans", targetNamespace = "")DoCheckTrans doCheckTrans) throws InputOuputException,NoSuchAlgorithmException,KeyManagementException;

    @WebMethod(action = "doM2M")
    public DoM2MResponse doM2M(@WebParam(name = "doM2M", targetNamespace = "")DoM2M doM2M) throws InputOuputException,NoSuchAlgorithmException,KeyManagementException;

    @WebMethod(action = "doM2S")
    public DoM2SResponse doM2S(@WebParam(name = "doM2S", targetNamespace = "")DoM2S doM2S) throws InputOuputException,NoSuchAlgorithmException,KeyManagementException;

    @WebMethod(action = "doS2M")
    public DoS2MResponse doS2M(@WebParam(name = "doS2M", targetNamespace = "")DoS2M doS2M) throws InputOuputException,NoSuchAlgorithmException,KeyManagementException;

    @WebMethod(action = "doS2S")
    public DoS2SResponse doS2S(@WebParam(name = "doS2S", targetNamespace = "")DoS2S doS2S) throws InputOuputException,NoSuchAlgorithmException,KeyManagementException;
}
