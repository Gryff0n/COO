package commande;

import modele.DisqueDur;

public class CommandeCapaciteDisqueDur implements Commande {

    private DisqueDur disqueDur;
    private int nouvelleCapacite;
    private int ancienneCapacite;

    public CommandeCapaciteDisqueDur(DisqueDur disqueDur, int nouvelleCapacite) {
        this.disqueDur = disqueDur;
        this.nouvelleCapacite = nouvelleCapacite;
    }

    @Override
    public void executer() {
        // Sauvegarder l'ancienne valeur pour pouvoir annuler
        this.ancienneCapacite = disqueDur.getCapacite();
        disqueDur.setCapacite(nouvelleCapacite);
    }

    @Override
    public void annuler() {
        disqueDur.setCapacite(ancienneCapacite);
    }
}