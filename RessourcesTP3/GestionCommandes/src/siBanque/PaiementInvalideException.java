package siBanque;

public class PaiementInvalideException extends Exception {
    public PaiementInvalideException() {
    }

    public PaiementInvalideException(String message) {
        super(message);
    }
}
