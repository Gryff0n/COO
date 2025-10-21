package modele;

public class ConnexionImpossibleException extends Exception {
    public ConnexionImpossibleException() {
    }

    public ConnexionImpossibleException(String message) {
        super(message);
    }
}
