package modeleRobots;

public class R2D2 extends Robot{



    public R2D2(String nom, int vitesse) {
        super(nom, vitesse);
        setModeDeplacement(new Marcher());
    }

    public void deplacement(Terrain t) {
        if(t.estAccidente(getPosition())){
            setModeDeplacement(new SePropulser());
            this.vitesse = 4;
        }
        else {
            setModeDeplacement(new Rouler());
            this.vitesse = 5;
        }
        nouvellePosition();
        getModeDeplacement().avance(this.vitesse);
    }
}
