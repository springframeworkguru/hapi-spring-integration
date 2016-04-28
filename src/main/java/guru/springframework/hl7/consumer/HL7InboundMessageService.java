package guru.springframework.hl7.consumer;

//import ca.uhn.hl7v2.model.Message;

import ca.uhn.hl7v2.model.Message;

/**
 * Created by jt on 4/27/16.
 */
public interface HL7InboundMessageService {

    Object processMessage(Message hl7);
}
