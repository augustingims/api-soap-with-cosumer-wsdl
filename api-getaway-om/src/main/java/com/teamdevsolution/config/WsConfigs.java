package com.teamdevsolution.config;

import com.teamdevsolution.services.impl.WebSoapServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WsConfigs {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        SpringBus springBus = new SpringBus();
        LoggingFeature loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        loggingFeature.initialize(springBus);
        springBus.getFeatures().add(loggingFeature);
        return springBus;
    }

    @Bean
    public Endpoint webSoapService(SpringBus cxf, @Qualifier("exposedWebServiceID")WebSoapServiceImpl webSoapService){
        EndpointImpl endpoint = new EndpointImpl(cxf,webSoapService);
        //endpoint.publish("/WebSoapService");
        return endpoint;
    }
}
