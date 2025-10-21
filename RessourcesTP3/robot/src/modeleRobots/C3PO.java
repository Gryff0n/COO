package modeleRobots;

public class C3PO extends Robot{



    public C3PO(String nom, int vitesse) {
        super(nom, vitesse);
        setModeDeplacement(new Marcher());
    }

    public void deplacement(Terrain t) {
        if(t.estAccidente(getPosition())){
            setModeDeplacement(new Marcher());
            this.vitesse = 3;
        }
        else {
            setModeDeplacement(new Rouler());
            this.vitesse = 6;
        }
        nouvellePosition();
        getModeDeplacement().avance(this.vitesse);
    }
}
