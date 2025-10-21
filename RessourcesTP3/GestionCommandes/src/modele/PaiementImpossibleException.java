package modele;

public class PaiementImpossibleException extends Exception {
    public PaiementImpossibleException() {
    }

    public PaiementImpossibleException(String message) {
        super(message);
    }
}
