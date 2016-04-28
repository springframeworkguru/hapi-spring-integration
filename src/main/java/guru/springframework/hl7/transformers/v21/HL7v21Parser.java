package guru.springframework.hl7.transformers.v21;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import org.springframework.stereotype.Component;

/**
 * Created by william.ott on 4/28/2016.
 */
@Component
public class HL7v21Parser {
    public Message parseMessage(String message) throws HL7Exception {
        HapiContext context = new DefaultHapiContext();

        Parser p = context.getGenericParser();

        return p.parse(message);
    }
}
