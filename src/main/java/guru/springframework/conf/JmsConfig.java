package guru.springframework.conf;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * Created by jt on 4/27/16.
 */
@Configuration
public class JmsConfig {

    public static final String HL7_INBOUND_QUEUE = "hl7.inbound";

    @Bean
    public Queue hl7InboundQueue(){
        return new ActiveMQQueue(HL7_INBOUND_QUEUE);
    }
}
