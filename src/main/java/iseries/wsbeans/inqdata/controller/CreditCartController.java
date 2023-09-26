package iseries.wsbeans.inqdata.controller;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Map;

@RestController
@RequestMapping("/web/services/creditcard")
public class CreditCartController {

    public final String CREDIT_CARD_RESPONSE = "src/main/resources/specification/CreditCard_cardnumber_response.json";

    @PostMapping
    public ResponseEntity<Map<String, Object>> creditCard(@RequestBody Object request)throws Exception{
      return new ResponseEntity<>(new ObjectMapper().readValue(new File(CREDIT_CARD_RESPONSE), new TypeReference<Map<String, Object>>() {}), HttpStatus.OK);
    }
}
