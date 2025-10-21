package modele;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionnaireCommande {
    private IServicePaiement servicePaiement;

    public void setServicePaiement(IServicePaiement servicePaiement) {
        this.servicePaiement = servicePaiement;
    }

    private Map<String, Corrige> lesCorriges= new HashMap<>();
    private Map<Integer, Commande> lesCommandes= new HashMap<>();
    private Map<String, Client> lesClients = new HashMap<>();

    public GestionnaireCommande(){
        lesCorriges.putIfAbsent("COO",new Corrige("COO",(float)2.3));
        lesCorriges.putIfAbsent("PIPOO",new Corrige("PIPOO",(float)1.5));
        lesCorriges.putIfAbsent("Reseau",new Corrige("Reseau",(float)0.5));
        Client c1 = new Client("Dudu","d","Dupont");
        Client c2 = new Client("Mar","m","Martin");
        Client c3 = new Client("Duv","dv","Duval");
        Client c4 = new Client("Riva","r","Rivalo");
        Client c5 = new Client("Jan","ja","Janvier");
        Client c6 = new Client("Apri","ap","April");

        lesClients.putIfAbsent(c1.getLogin(),c1);
        lesClients.putIfAbsent(c2.getLogin(),c2);
        lesClients.putIfAbsent(c3.getLogin(),c3);
        lesClients.putIfAbsent(c4.getLogin(),c4);
        lesClients.putIfAbsent(c5.getLogin(),c5);
        lesClients.putIfAbsent(c6.getLogin(),c6);
    }
    public void connexion(String login, String mdp ) throws ConnexionImpossibleException {
        Client c = lesClients.get(login);
        if (c==null)
            throw new ConnexionImpossibleException("login inconnu");
        else {
            if (!c.getMdp().equals(mdp))
                throw new ConnexionImpossibleException("mdp incorrect");
        }

    }
    public int passerCommande(String login,Set<String> panier) throws PaiementImpossibleException {
        Commande c = new Commande();
        for (String nom:panier){
            c.ajouterCorrige( lesCorriges.get(nom));
        }
        Client c1 = lesClients.get(login);
        c.ajouterClient(c1);
        lesCommandes.put(c.getNumCommande(),c);
        servicePaiement.gererPaiement(c.calculerTotal());
        return c.getNumCommande();
    }

    public String lesCorriges(){
        Collection<Corrige> corriges =lesCorriges.values();
        return corriges.toString();
    }
    public Set<String> lesNomsDesCorriges(){
        return lesCorriges.keySet();
    }

    public String recapCommandes(){
        return lesCommandes.values().toString();
    }

}
