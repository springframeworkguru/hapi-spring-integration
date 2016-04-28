package guru.springframework.hl7.exceptions;

public class UnhandledHL7MessageException extends Exception {
    public UnhandledHL7MessageException(String message)
    {
        super(message);
    }
}
