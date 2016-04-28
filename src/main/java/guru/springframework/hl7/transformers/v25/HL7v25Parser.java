package guru.springframework.hl7.transformers.v25;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.GenericParser;
import org.springframework.stereotype.Component;

@Component
public class HL7v25Parser {
    public Message parseMessage(String hl7Message) throws HL7Exception
    {
        HapiContext defaultHapiContext = new DefaultHapiContext();
        GenericParser parser = defaultHapiContext.getGenericParser();

        return parser.parse(hl7Message);
    }
}
