package modeleRobots;

public class BB8 extends Robot{



    public BB8(String nom, int vitesse) {
        super(nom, vitesse);
        setModeDeplacement(new Rouler());
    }

    public void deplacement(Terrain t) {
        if(t.estAccidente(getPosition())){
            this.vitesse = 2;
        }
        else {
            this.vitesse = 5;
        }
        nouvellePosition();
        getModeDeplacement().avance(this.vitesse);
    }
}
