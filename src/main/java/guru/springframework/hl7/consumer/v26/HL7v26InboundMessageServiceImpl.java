package guru.springframework.hl7.consumer.v26;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.datatype.XPN;
import ca.uhn.hl7v2.model.v26.message.ADT_A01;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import guru.springframework.hl7.consumer.HL7InboundMessageService;
import org.springframework.stereotype.Service;

/**
 * Created by william.ott on 4/28/2016.
 */
@Service("hl7v26InboundService")
public class HL7v26InboundMessageServiceImpl implements HL7InboundMessageService<Message> {
    @Override
    public Message processMessage(Message hapiMsg) {
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("I got a v26 HAPI message");
        ADT_A01 adtMsg = (ADT_A01)hapiMsg;
        MSH msh = adtMsg.getMSH();

        XPN[] xpns = adtMsg.getPID().getPatientName();

        for (XPN xpn : xpns) {
            System.out.println(xpn.toString());
        }        return null;    }
}
