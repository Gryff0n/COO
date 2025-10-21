package robots;
import java.io.*;

import modeleRobots.*;

public class Main {

    public static void main(String[] args) {
        Terrain t = new Terrain(1000f);
        BB8 bb8 = new BB8("Bb8", 1);
        C3PO c3PO = new C3PO("C3PO", 1);
        R2D2 r2D2 = new R2D2("r2d2", 1);
        while (bb8.getPosition() < t.getFin() && c3PO.getPosition() < t.getFin()) {
            bb8.deplacement(t);
            c3PO.deplacement(t);
            r2D2.deplacement(t);
        }
        System.out.println("Fin\n"+bb8.getPosition()+"\n"+c3PO.getPosition()+"\n"+r2D2.getPosition());
    }
}
