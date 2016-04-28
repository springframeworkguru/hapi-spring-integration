package guru.springframework.hl7.publish;

/**
 * Created by jt on 4/27/16.
 */
public interface HL7MessageService {

    void sendHL7Message(String hl7);
}
