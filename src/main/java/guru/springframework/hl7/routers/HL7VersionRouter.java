package guru.springframework.hl7.routers;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.GenericMessage;
import ca.uhn.hl7v2.parser.GenericModelClassFactory;
import ca.uhn.hl7v2.util.Terser;
import guru.springframework.hl7.exceptions.InvalidHL7MessageException;
import guru.springframework.hl7.exceptions.UnhandledHL7MessageException;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.springframework.integration.annotation.Router;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 4/28/16.
 */
@Component
public class HL7VersionRouter {

    //@Router
    public String route(String message) throws UnhandledHL7MessageException, InvalidHL7MessageException{

        String routingChannel;
        final String messageVersion;
        DefaultHapiContext defaultHapiContext = new DefaultHapiContext();
        defaultHapiContext.setModelClassFactory(new GenericModelClassFactory());

        try {
            GenericMessage genericMessage = (GenericMessage) defaultHapiContext.getGenericParser().parse(message);
            messageVersion = genericMessage.getVersion();
            switch (messageVersion)
            {
                case "2.1":
                    routingChannel = "hl7v21InboundChannel";
                    break;
                case "2.2":
                    routingChannel = "hl7v22InboundChannel";
                    break;
                case "2.3":
                    routingChannel = "hl7v23InboundChannel";
                    break;
                case "2.4":
                    routingChannel = "hl7v24InboundChannel";
                    break;
                case "2.5":
                    routingChannel = "hl7v25InboundChannel";
                    break;
                case "2.6":
                    routingChannel = "hl7v26InboundChannel";
                    break;
                default:
                    System.out.println("Unhandled Message Received");
                    throw new UnhandledHL7MessageException(String.format("Unhandled Message Received: %s", messageVersion));
            }



        } catch (HL7Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
            throw new InvalidHL7MessageException("Invalid Message Received");
        }

        //todo - inspect string to return proper channel
        return routingChannel;
    }

}
