package guru.springframework.hl7.transformers;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 4/27/16.
 */
@Component
public class HL7Parser {

    public Message parseMessage(String message) throws HL7Exception {
        HapiContext context = new DefaultHapiContext();

        Parser p = context.getGenericParser();

        return p.parse(message);
    }
}
