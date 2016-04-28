package guru.springframework.hl7.routers;

import org.springframework.integration.annotation.Router;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 4/28/16.
 */
@Component
public class HL7VersionRouter {

    //@Router
    public String route(String message){

        //todo - inspect string to return proper channel
        return "hl7v22InboundChannel";
    }

}
