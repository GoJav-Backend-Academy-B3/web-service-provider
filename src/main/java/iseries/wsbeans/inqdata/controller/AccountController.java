package iseries.wsbeans.inqdata.controller;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Map;

@RestController
@RequestMapping("/web/services/INQACCT")
public class AccountController {

    public final String INQUIRY_ACC_RESPONSE = "src/main/resources/specification/InquiryAccount_response.json";

    @GetMapping("/INQACCT/{cifnbr}")
    public ResponseEntity<Map<String, Object>> inqAccount(@PathVariable(name = "cifnbr") String cifNumber) throws Exception{
        return new ResponseEntity<>(
                new ObjectMapper().readValue(new File(INQUIRY_ACC_RESPONSE), new TypeReference<Map<String, Object>>() {}), HttpStatus.OK
        );
    }
}
