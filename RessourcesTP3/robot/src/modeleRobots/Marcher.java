package modeleRobots;

public class Marcher implements IModeDeplacement {

    @Override
    public void avance(int vitesse) {
        String deplacement = "\u001B[32m";
        for ( int i=0;i<vitesse;i++)
            deplacement +="\uD83D\uDC63";
        deplacement+=ANSI_RESET;

        System.out.println( deplacement);

    }
}
