package modele;

import java.util.HashSet;
import java.util.Set;

public class Commande {
    private int numCommande;
    private Client client;
    private Set<Corrige> lesCorrigesCommandes = new HashSet<>();
    private static int numSuivant = 1;

    public void ajouterCorrige(Corrige corrige){
        lesCorrigesCommandes.add(corrige);
    }

    public Commande() {
        this.numCommande = numSuivant++;
    }
    public  void ajouterClient(Client client){
        this.client=client;
    }

    public int getNumCommande() {
        return numCommande;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "numCommande=" + numCommande +
                " nom client=" + client.getNom() +
                ", lesCorriges=" + lesCorrigesCommandes +
                '}';
    }
    public double calculerTotal(){
        double total = 0.0;
        for (Corrige corrige : lesCorrigesCommandes){
            total += corrige.getPrix();
        }
        return total;
    }


}
