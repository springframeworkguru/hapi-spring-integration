package guru.springframework.hl7.exceptions;

public class InvalidHL7MessageException extends Exception {
    public InvalidHL7MessageException(String message) {
        super(message);
    }
}
