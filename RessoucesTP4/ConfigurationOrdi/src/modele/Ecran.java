package modele;

public class Ecran extends Composant {
    private String resolution;
    private int taille;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Ecran(String resolution, int taille) {
        this.resolution = resolution;
        this.taille = taille;
    }


    @Override
    public double getPrix() {
        return 200+taille*10;
    }

    @Override
    public String toString() {
        return "Ecran{" + super.toString()+
                ", resolution='" + resolution + '\'' +
                ", taille=" + taille +
                '}';
    }
}
