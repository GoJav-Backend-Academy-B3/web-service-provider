package iseries.wsbeans.inqdata.endpoint;

import iseries.wsbeans.inqdata.Inqdata;
import iseries.wsbeans.inqdata.InqdataResponse;
import iseries.wsbeans.inqdata.ObjectFactory;
import iseries.wsbeans.inqdata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Endpoint
public class AccountEndpoint {

    @Autowired
    private AccountService accoutService;

    @PayloadRoot(namespace = "http://inqdata.wsbeans.iseries/",
            localPart = "inqdata")
    @ResponsePayload
    public JAXBElement<InqdataResponse> inqdata(@RequestPayload JAXBElement<Inqdata> inqdata) {
        InqdataResponse inqdataResponse = new InqdataResponse();

        inqdataResponse.setReturn(accoutService.getInqData(inqdata.getValue().getArg0().getACCTNBR()));

        // Create a JAXBElement wrapping the InqdataResponse
        JAXBElement<InqdataResponse> jaxbElement = new JAXBElement<>(new QName("http://inqdata.wsbeans.iseries/", "inqdataResponse"), InqdataResponse.class, inqdataResponse);

        return jaxbElement;
    }
}
