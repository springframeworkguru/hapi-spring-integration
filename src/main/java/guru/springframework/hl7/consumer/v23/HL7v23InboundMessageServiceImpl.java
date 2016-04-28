package guru.springframework.hl7.consumer.v23;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v23.datatype.XPN;
import ca.uhn.hl7v2.model.v23.message.ADT_A01;
import ca.uhn.hl7v2.model.v23.segment.PID;

import guru.springframework.hl7.consumer.HL7InboundMessageService;
import org.springframework.stereotype.Service;

@Service("hl7v23InboundService")
public class HL7v23InboundMessageServiceImpl implements HL7InboundMessageService<Message> {

    @Override
    public Message processMessage(Message hapiMsg) {
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("#################################");
        System.out.println("I got a HAPI 2.3 message");
        ADT_A01 adtMsg = (ADT_A01)hapiMsg;

        PID pID = adtMsg.getPID();

        XPN xpn[] = pID.getPatientName();

        System.out.println(xpn[0].getGivenName().toString() + " " + xpn[0].getFamilyName().toString());
        return null;
    }
}
