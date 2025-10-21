package modele;

import siBanque.PaiementInvalideException;
import siBanque.SIBanque;

public class ServicePaiementCB implements IServicePaiement {
    private SIBanque siBanque;
    private int numCarte;
    private String nom;
    private int annee;
    private int mois;
    private int code;

    public ServicePaiementCB(SIBanque siBanque, int numCarte, String nom, int annee, int mois, int code) {
        this.siBanque = siBanque;
        this.numCarte = numCarte;
        this.nom = nom;
        this.annee = annee;
        this.mois = mois;
        this.code = code;
    }

    public void gererPaiement(double montant) throws PaiementImpossibleException {
        try {
            siBanque.enregistrerPaiement(montant,numCarte,nom, annee, mois, code);
        } catch (PaiementInvalideException e) {
            throw new PaiementImpossibleException("Infos carte bancaire invalides");
        }
    }
}
