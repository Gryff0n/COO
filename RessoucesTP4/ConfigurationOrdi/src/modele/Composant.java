package modele;

public abstract class Composant {

    public abstract double getPrix();

    @Override
    public String toString() {
        return "prix =" +getPrix();
    }
}
