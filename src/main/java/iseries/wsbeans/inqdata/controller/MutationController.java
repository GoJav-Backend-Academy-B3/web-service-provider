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
@RequestMapping("web/services/ACCTHST")
public class MutationController {

    public final String ACCT_HISTORY_RESPONSE = "src/main/resources/specification/Mutasi_response.json";

    @GetMapping("/ACCTHST/{ACCTNBR}/{ACCTTP}/{STRDATE}/{ENDDATE}/{STRINDEX}")
    public ResponseEntity<Map<String, Object>> acctHistory(
            @PathVariable(value = "ACCTNBR") String acctNumber,
            @PathVariable(value = "ACCTTP") String acctTP,
            @PathVariable(value = "STRDATE") String strDate,
            @PathVariable(value = "ENDDATE") String endDate,
            @PathVariable(value = "STRINDEX") String strIndex
    )throws Exception{
        return new ResponseEntity<>(
                new ObjectMapper().readValue(new File(ACCT_HISTORY_RESPONSE), new TypeReference<Map<String, Object>>() {}), HttpStatus.OK
        );
    }
}
