package iseries.wsbeans.inqdata.service;

import iseries.wsbeans.inqdata.InqdataResult;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {
    private static Map<String, InqdataResult>  inqdataResultMap = new HashMap<>();

    @PostConstruct
    public void initializer() {
        InqdataResult inqdataResult1 = new InqdataResult();

        inqdataResult1.setACCTNBR("1");
        inqdataResult1.setACCTTYPE("1");
        inqdataResult1.setADDRESS1("1");
        inqdataResult1.setADDRESS2("1");
        inqdataResult1.setADDRESS3("1");
        inqdataResult1.setADDRESS4("1");
        inqdataResult1.setADDRESS5("1");
        inqdataResult1.setCIF("1");
        inqdataResult1.setCTCOTHER("1");
        inqdataResult1.setDOB("1");
        inqdataResult1.setFAXNBR("1");
        inqdataResult1.setFULLNAME("1");
        inqdataResult1.setHOMEPH("1");
        inqdataResult1.setIDENTITY("1");
        inqdataResult1.setKEYPARAM("1");
        inqdataResult1.setMAIDENNAME("1");
        inqdataResult1.setMOBILEPH("1");
        inqdataResult1.setNPWP("1");
        inqdataResult1.setOFFICEPH("1");
        inqdataResult1.setPOB("1");
        inqdataResult1.setPRIORITY("1");
        inqdataResult1.setRESP("1");
        inqdataResult1.setZIPCODE("1");

        InqdataResult inqdataResult2 = new InqdataResult();

        inqdataResult2.setACCTNBR("2");
        inqdataResult2.setACCTTYPE("2");
        inqdataResult2.setADDRESS1("2");
        inqdataResult2.setADDRESS2("2");
        inqdataResult2.setADDRESS3("2");
        inqdataResult2.setADDRESS4("2");
        inqdataResult2.setADDRESS5("2");
        inqdataResult2.setCIF("2");
        inqdataResult2.setCTCOTHER("2");
        inqdataResult2.setDOB("2");
        inqdataResult2.setFAXNBR("2");
        inqdataResult2.setFULLNAME("2");
        inqdataResult2.setHOMEPH("2");
        inqdataResult2.setIDENTITY("2");
        inqdataResult2.setKEYPARAM("2");
        inqdataResult2.setMAIDENNAME("2");
        inqdataResult2.setMOBILEPH("2");
        inqdataResult2.setNPWP("2");
        inqdataResult2.setOFFICEPH("2");
        inqdataResult2.setPOB("2");
        inqdataResult2.setPRIORITY("2");
        inqdataResult2.setRESP("2");
        inqdataResult2.setZIPCODE("2");

        inqdataResultMap.putIfAbsent("1", inqdataResult1);
        inqdataResultMap.putIfAbsent("2", inqdataResult2);
    }

    public InqdataResult getInqData(String accNumber) {
        return inqdataResultMap.get(accNumber);
    }
}
