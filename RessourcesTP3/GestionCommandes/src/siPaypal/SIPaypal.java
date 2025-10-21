package siPaypal;

import java.util.HashSet;
import java.util.Set;

public class SIPaypal {
   Set<Compte> lesComptes = new HashSet<>();
    public SIPaypal(){
        Compte c1 = new Compte("duval@hotmail.com","dudu",1500);
        Compte c2 = new Compte("riv@hotmail.com","riri",1200);
      lesComptes.add(c1);
      lesComptes.add(c2);
    }
    public void enregistrerPaiement(double montant,String mail, String mdp) throws EchecAuthentificationException {
        boolean paiementEffectue=false;
        for (Compte c: lesComptes){
           if (c.getMail().equals(mail) && c.getMdp().equals(mdp)){
               c.debiter(montant);
               paiementEffectue=true;
               break;
           }
       }
        if (!paiementEffectue)
            throw new EchecAuthentificationException("Client inconnu");
        }

    @Override
    public String toString() {
        return "SIPaypal{" +
                "lesComptes=" + lesComptes +
                '}';
    }
}
