package iseries.wsbeans.inqdata.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {
    // bean definitions

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/soapWS/*");
    }

    @Bean(name = "inqdata")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema inqDataSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setSchema(inqDataSchema);
        wsdl11Definition.setLocationUri("/soapWS");
        wsdl11Definition.setPortTypeName("AccountServicePort");
        wsdl11Definition.setTargetNamespace("http://inqdata.wsbeans.iseries/");

        return wsdl11Definition;
    }

    @Bean
    public XsdSchema inqDataSchema() {
        return new SimpleXsdSchema(new ClassPathResource("inqdata.xsd"));
    }


}
