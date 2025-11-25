package modele;

public class DisqueDur extends Composant {

    private int vitesseLecture;
    private int vitesseEcriture;
    private int capacite;

    public int getCapacite() {
        return capacite;
    }

    public DisqueDur(int vitesseLecture, int vitesseEcriture, int capaciteStockage) {

        this.vitesseLecture = vitesseLecture;
        this.vitesseEcriture = vitesseEcriture;
        this.capacite = capaciteStockage;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public double getPrix() {
        return 330+ capacite*20;
    }

    @Override
    public String toString() {
        return " DisqueDur{" + super.toString()+
                ", vitesseLecture=" + vitesseLecture +
                ", vitesseEcriture=" + vitesseEcriture +
                ", capaciteStockage=" + capacite +
                '}';
    }
}
