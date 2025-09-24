package clonage;

public class CentreClonage {
    private String nom;
    private String ville;

    public CentreClonage(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public Clone genererClone(String espece){
        Clone clone = new Clone(espece);
        clone.alimenterEnergie();
        clone.oxygener();
        return clone;
    }

}
