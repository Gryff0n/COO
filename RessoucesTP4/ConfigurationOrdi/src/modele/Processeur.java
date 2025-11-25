package modele;

public class Processeur extends Composant {
    private double frequence;
    private int puissance;
    private int nbCoeurs;

    public int getNbCoeurs() {
        return nbCoeurs;
    }

    public double getFrequence() {
        return frequence;
    }

    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }

    public void setNbCoeurs(int nbCoeurs) {
        this.nbCoeurs = nbCoeurs;
    }

    public Processeur(double frequence, int puissance, int nbCoeurs) {

        this.frequence = frequence;
        this.puissance = puissance;
        this.nbCoeurs = nbCoeurs;

    }

    @Override
    public double getPrix() {
        return 200+nbCoeurs*20 + frequence*10;
    }

    @Override
    public String toString() {
        return "Processeur{" + super.toString()+
                ", frequence=" + frequence +
                ", puissance=" + puissance +
                ", nbCoeurs=" + nbCoeurs +
                '}';
    }
}
