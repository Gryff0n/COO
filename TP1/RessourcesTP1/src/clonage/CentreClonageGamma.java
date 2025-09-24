package clonage;

public class CentreClonageGamma extends CentreClonage {


    public CentreClonageGamma(String nom, String ville) {
        super(nom, ville);
    }

    public Clone creerClone(String espece) {
        return new CloneGamma(espece);
    }
}
