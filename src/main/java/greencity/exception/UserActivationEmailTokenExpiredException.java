package greencity.exception;

/**
 * Exception that we get when user trying to verify email with token that has expired.
 *
 * @author Nazar Stasyuk
 * @version 1.0
 */
public class UserActivationEmailTokenExpiredException extends RuntimeException {
    /**
     * Generated javadoc, must be replaced with real one.
     */
    public UserActivationEmailTokenExpiredException(String message) {
        super(message);
    }
}