package guru.springframework.hl7.transformers.v23;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import guru.springframework.hl7.transformers.HL7Parser;
import guru.springframework.hl7.transformers.HL7ParserBase;
import org.springframework.stereotype.Component;

@Component
public class HL7v23Parser  extends HL7ParserBase implements HL7Parser {

}
