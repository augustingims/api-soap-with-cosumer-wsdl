package com.teamdevsolution.config;

import com.ws1.services.ApigwomServicePortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WsClientsConfigs {

    @Value("${apigwom.address}")
    private String apigwmoadress;

    @Bean
    @Scope("prototype")
    public JaxWsProxyFactoryBean jaxWsProxyFactoryBean(){
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        return jaxWsProxyFactoryBean;
    }

    @Bean(name = "apigwomExposedServiceID")
    public ApigwomServicePortType apigwomService(JaxWsProxyFactoryBean jaxWsProxyFactoryBean){
        jaxWsProxyFactoryBean.setServiceClass(ApigwomServicePortType.class);
        jaxWsProxyFactoryBean.setAddress(apigwmoadress);
        ApigwomServicePortType apiWs = jaxWsProxyFactoryBean.create(ApigwomServicePortType.class);
        return  apiWs;
    }
}
