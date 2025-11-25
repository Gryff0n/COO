package commande;

import modele.Ecran;

public class CommandeTailleEcran implements Commande{
    private Ecran ecran;
    private int ancienneValeur;
    private int taille;
    public CommandeTailleEcran(Ecran ecran, int taille) {
        this.ecran = ecran;
        this.taille = taille;
    }
    @Override
    public void executer() {
        ancienneValeur= ecran.getTaille();
        ecran.setTaille(taille);
    }

    @Override
    public void annuler() {
        ecran.setTaille(ancienneValeur);
    }
}
