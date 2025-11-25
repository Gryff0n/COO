package commande;

import modele.Processeur;

public class CommandeFrequenceProcesseur implements Commande {
    private Processeur processeur;
    private double ancienneValeur;
    private double frequence;

    public CommandeFrequenceProcesseur(Processeur processeur, double frequence) {
        this.processeur = processeur;
        this.frequence = frequence;
    }

    @Override
    public void executer() {
        ancienneValeur= processeur.getFrequence();
        processeur.setFrequence(frequence);
    }

    @Override
    public void annuler() {
        processeur.setFrequence(ancienneValeur);
    }
}
