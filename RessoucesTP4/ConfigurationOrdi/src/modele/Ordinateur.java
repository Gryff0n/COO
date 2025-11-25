package modele;

public class Ordinateur {
    private DisqueDur disqueDur;
    private Processeur processeur;
    private Ecran ecran;

    public Ordinateur(DisqueDur disqueDur, Processeur processeur, Ecran ecran) {
        this.disqueDur = disqueDur;
        this.processeur = processeur;
        this.ecran = ecran;
    }
    public double calculPrix(){
        return disqueDur.getPrix()+processeur.getPrix()+ecran.getPrix();
    }

    @Override
    public String toString() {
        return "Votre ordinateur est composé de \n"+ disqueDur +"\n"+ processeur +"\n"+ ecran;
    }
}
