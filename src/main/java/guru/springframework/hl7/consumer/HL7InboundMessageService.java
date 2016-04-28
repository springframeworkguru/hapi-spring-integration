package guru.springframework.hl7.consumer;


/**
 * Created by jt on 4/27/16.
 */
public interface HL7InboundMessageService<T> {

    T processMessage(T hl7);
}
