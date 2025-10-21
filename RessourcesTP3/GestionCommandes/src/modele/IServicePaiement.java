package modele;

public interface IServicePaiement {
    void gererPaiement (double montant) throws PaiementImpossibleException;
}
