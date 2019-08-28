package com.teamdevsolution.services.impl;

import com.teamdevsolution.dto.*;

import com.teamdevsolution.services.WebSoapService;
import com.ws1.services.ApigwomServicePortType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.WebService;

@WebService(serviceName = "WebSoapService", endpointInterface = "com.teamdevsolution.services.WebSoapService", portName = "WebSoapPort")
@Service("exposedWebServiceID")
public class WebSoapServiceImpl implements WebSoapService {

    @Resource(name = "apigwomExposedServiceID")
    private ApigwomServicePortType apigwomService;

    @Override
    public TcheckBalResponse TcheckBal(TcheckBal tcheckBal) {

        return null;
    }

    @Override
    public DoCheckTransResponse doCheckTrans(DoCheckTrans doCheckTrans) {
        return null;
    }

    @Override
    public DoM2MResponse doM2M(DoM2M doM2M) {
        return null;
    }

    @Override
    public DoM2SResponse doM2S(DoM2S doM2S){
        return null;
    }

    @Override
    public DoS2MResponse doS2M(DoS2M doS2M) {
        return null;
    }

    @Override
    public DoS2SResponse doS2S(DoS2S doS2S) {
        return null;
    }
}
