package modeleRobots;

public class Terrain {
    private final float fin;

    public Terrain(float fin) {
        this.fin = fin;
    }

    public boolean estAccidente(float position) {
        boolean estA = false;
        if (position > fin/2)
            estA = true;
        return estA;
    }

    public float getFin() {
        return fin;
    }
}
