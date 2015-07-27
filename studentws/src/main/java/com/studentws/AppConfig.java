package com.studentws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Created by Ufuk on 16-07-15.
 */
@Configuration
@EnableWs // That will provide web service configuration
@ComponentScan(basePackages = "com.studentws")
public class AppConfig extends WsConfigurerAdapter {

    @Bean(name = "students")
    // Creates SOAP for the given XSD schema
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema studentsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("StudentsPort");
        wsdl11Definition.setLocationUri("/soapws");
        wsdl11Definition.setTargetNamespace("http://studentws.com/soap");
        wsdl11Definition.setSchema(studentsSchema);
        return wsdl11Definition;
    }

    @Bean
    // Abstraction for XSD schema
    public XsdSchema studentsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("students.xsd"));
    }
}
