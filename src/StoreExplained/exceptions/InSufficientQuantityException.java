package StoreExplained.exceptions;

public class InSufficientQuantityException extends RuntimeException {
    public InSufficientQuantityException(String message) {
        super(message);
    }
}
