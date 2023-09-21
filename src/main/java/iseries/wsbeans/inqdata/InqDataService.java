package iseries.wsbeans.inqdata;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class InqDataService {

    public InqdataResult bindingNameAndType(InqdataInput input) {
        InqdataResult result = new InqdataResult();

        result.setACCTNBR(input.getACCTNBR());
        result.setACCTTYPE(input.getACCTTYPE());

        return result;
    }
}
