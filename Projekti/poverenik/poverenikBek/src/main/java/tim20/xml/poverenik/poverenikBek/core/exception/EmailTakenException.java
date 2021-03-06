package tim20.xml.poverenik.poverenikBek.core.exception;

public class EmailTakenException extends Exception {
    public EmailTakenException(String email) {
        super(String.format("Email '%s' is already taken.", email));
    }

    public EmailTakenException(String email, Throwable cause) {
        super(String.format("Email '%s' is already taken.", email), cause);
    }
}
