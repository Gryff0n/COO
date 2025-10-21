package modele;

import siPaypal.EchecAuthentificationException;
import siPaypal.SIPaypal;


public class ServicePaiementPaypal implements IServicePaiement{
    private SIPaypal siPaypal;
    private String mail;
    private String mdp;

    public ServicePaiementPaypal(SIPaypal siPaypal, String mail, String mdp) {
        this.siPaypal = siPaypal;
        this.mail = mail;
        this.mdp = mdp;
    }

    @Override
    public void gererPaiement(double montant) throws PaiementImpossibleException {
        try {
            siPaypal.enregistrerPaiement(montant,mail,mdp);
        } catch (EchecAuthentificationException e) {
            throw new PaiementImpossibleException("Authentification paypal impossible");
        }
    }
}
