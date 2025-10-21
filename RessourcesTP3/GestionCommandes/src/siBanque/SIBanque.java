package siBanque;

import java.util.HashSet;
import java.util.Set;

public class SIBanque {
    Set<CB> lesCartes = new HashSet<>();
    public SIBanque(){
        CompteClient c1 = new CompteClient("Dupont",1500.0);
        CB cb1 =new CB(123, 2022,12,156,c1);
        CompteClient c2 = new CompteClient("Martin", 1200.0);
       CB cb2 =new CB(1768,2023,3,765,c2);
       lesCartes.add(cb1);
       lesCartes.add(cb2);
    }
    public void enregistrerPaiement(double montant,int numCarte, String nom, int annee,int mois, int code) throws PaiementInvalideException {
        boolean paiementEffectue=false;
        for (CB carte : lesCartes) {
            if (carte.getNumCarte() == numCarte && carte.getAnnee() == annee && carte.getMois() == mois &&
                    carte.getCode() == code && carte.getNom().equals(nom)) {
                carte.enregistrerPaiement(montant);
                paiementEffectue=true;
            }
        }
        if (!paiementEffectue)
            throw new PaiementInvalideException("carte invalide");


    }

    @Override
    public String toString() {
        return "SIBanque{" +
                "lesCartes=" + lesCartes +
                '}';
    }
}
