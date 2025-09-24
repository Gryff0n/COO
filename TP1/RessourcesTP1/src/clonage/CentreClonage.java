package clonage;

abstract public class CentreClonage {
    private final String nom;
    private final String ville;

    public CentreClonage(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    abstract Clone creerClone(String espece);

    public Clone genererClone(String espece){
        Clone clone = creerClone(espece);
        clone.alimenterEnergie();
        clone.oxygener();
        return clone;
    }

}
