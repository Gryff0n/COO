package clonage;

public class CentreClonageEpsilon extends CentreClonage {


    public CentreClonageEpsilon(String nom, String ville) {
        super(nom, ville);
    }

    public Clone creerClone(String espece) {
        return new CloneEpsilon(espece);
    }
}
