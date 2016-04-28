package guru.springframework.hl7.consumer.v22;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v22.datatype.PN;
import ca.uhn.hl7v2.model.v22.message.ADT_A01;
import ca.uhn.hl7v2.model.v22.segment.MSH;

import guru.springframework.hl7.consumer.HL7InboundMessageService;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 4/27/16.
 */
@Service("hl7v22InboundService")
public class HL7v22InboundMessageServiceImpl implements HL7InboundMessageService<Message> {

    @Override
    public Message processMessage(Message hapiMsg) {
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("I got a HAPI message");
        ADT_A01 adtMsg = (ADT_A01)hapiMsg;
        MSH msh = adtMsg.getMSH();

        PN pn = adtMsg.getPID().getPatientName();

        System.out.println(pn.toString());
        return null;
    }
}
