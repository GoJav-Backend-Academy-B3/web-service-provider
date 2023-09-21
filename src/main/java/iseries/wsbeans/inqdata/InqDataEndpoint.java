package iseries.wsbeans.inqdata;

import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InqDataEndpoint {
    @Autowired
    private InqDataService inqDataService;

    private static final String NAMESPACE_URI = "http://inqdata.wsbeans.iseries/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "inqdata")
    @ResponsePayload
    public InqdataResponse getNameAndType(@RequestPayload InqdataInput input) {
        InqdataResponse response = new InqdataResponse();
        response.setReturn(inqDataService.bindingNameAndType(input));

        return response;
    }
}