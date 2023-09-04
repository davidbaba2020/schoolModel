package StoreExplained.exceptions;

public class InsufficientFund extends RuntimeException {
    public InsufficientFund(String message) {
        super(message);
    }
}
