package guru.springframework.hl7.consumer;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v22.datatype.PN;
import ca.uhn.hl7v2.model.v22.message.ADT_A01;
import ca.uhn.hl7v2.model.v22.segment.MSH;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 4/27/16.
 */
@Service("hl7InboundService")
public class HL7InboundMessageServiceImpl implements HL7InboundMessageService {

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
