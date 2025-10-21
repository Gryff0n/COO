package siPaylib;

import java.util.HashSet;
import java.util.Set;

public class SIPaylib {
   Set<ComptePaylib> lesComptes = new HashSet<>();
    public SIPaylib(){
        ComptePaylib c1 = new ComptePaylib("janvier@hotmail.com","janv",123456,1500);
        ComptePaylib c2 = new ComptePaylib("april@hotmail.com","apri",234567,1200);
      lesComptes.add(c1);
      lesComptes.add(c2);
    }
    public void enregistrerPaiement(double montant,String mail, String mdp, int codeSecret) throws EchecAuthentificationPaylibException {
        boolean paiementEffectue=false;
        for (ComptePaylib c: lesComptes){
           if (c.getMail().equals(mail) && c.getMdp().equals(mdp) && c.getCodeSecret()==codeSecret){
               c.debiter(montant);
               paiementEffectue=true;
               break;
           }
       }
        if (!paiementEffectue)
            throw new EchecAuthentificationPaylibException("Client inconnu");
        }

    @Override
    public String toString() {
        return "SIPaylib{" +
                "lesComptes=" + lesComptes +
                '}';
    }
}
