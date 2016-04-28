package guru.springframework.hl7.consumer.v24;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.XPN;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import guru.springframework.hl7.consumer.HL7InboundMessageService;
import org.springframework.stereotype.Service;

@Service("hl7v24InboundService")
public class HL7v24InboundMessageServiceImpl implements HL7InboundMessageService<Message> {

    @Override
    public Message processMessage(Message hapiMsg) {
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("I got a HAPI v2.4 message");
        ADT_A01 adtMsg = (ADT_A01) hapiMsg;
        MSH msh = adtMsg.getMSH();

        XPN[] xpns = adtMsg.getPID().getPatientName();

        for (XPN xpn : xpns) {
            System.out.println(xpn.toString());
        }
        return null;
    }
}
