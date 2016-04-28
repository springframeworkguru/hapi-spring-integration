package guru.springframework.hl7.publish.v23;

import guru.springframework.hl7.publish.HL7MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.*;

@Service
@Transactional
public class HL7v23MessagePublisherImpl implements HL7MessagePublisher {

    private Queue hl7InboundQueue;
    private JmsTemplate jmsTemplate;
    private ConnectionFactory connectionFactory;

    @Autowired
    public void setHl7InboundQueue(Queue hl7InboundQueue) {
        this.hl7InboundQueue = hl7InboundQueue;
    }

    @Autowired
    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Autowired
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendHL7Message(String hl7) {

        this.jmsTemplate.convertAndSend(this.hl7InboundQueue, hl7);
    }
}
