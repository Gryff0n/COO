package modele;

import java.util.Objects;

public class Corrige {
    private String nom;
    private float prix;

    public  Corrige(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }
    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Set the value of nom
     * @param newVar the new value of nom
     */
    public void setNom (String newVar) {
        nom = newVar;
    }

    /**
     * Get the value of nom
     * @return the value of nom
     */
    public String getNom () {
        return nom;
    }

    /**
     * Set the value of prix
     * @param newVar the new value of prix
     */
    public void setPrix (float newVar) {
        prix = newVar;
    }

    /**
     * Get the value of prix
     * @return the value of prix
     */
    public float getPrix () {
        return prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corrige corrige = (Corrige) o;
        return Float.compare(corrige.prix, prix) == 0 && Objects.equals(nom, corrige.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix);
    }

    @Override
    public String toString() {
        return "Corrige{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
