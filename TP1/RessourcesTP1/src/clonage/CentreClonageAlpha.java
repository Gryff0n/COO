package clonage;

public class CentreClonageAlpha extends CentreClonage {


    public CentreClonageAlpha(String nom, String ville) {
        super(nom, ville);
    }

    public Clone creerClone(String espece) {
        return new CloneAlpha(espece);
    }
}
