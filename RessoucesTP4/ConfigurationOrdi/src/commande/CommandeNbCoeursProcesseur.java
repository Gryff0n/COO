package commande;

import modele.Processeur;

public class CommandeNbCoeursProcesseur implements Commande{
    private Processeur processeur;
    private int ancienneValeur;
    private int nbCoeurs;
    public CommandeNbCoeursProcesseur(Processeur processeur, int nbCoeurs) {
        this.processeur = processeur;
        this.nbCoeurs= nbCoeurs;
    }

    @Override
    public void executer() {
        ancienneValeur= processeur.getNbCoeurs();
        processeur.setNbCoeurs(nbCoeurs);
    }

    @Override
    public void annuler() {
        processeur.setNbCoeurs(ancienneValeur);
    }
}
