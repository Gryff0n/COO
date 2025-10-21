package modeleRobots;

public class SePropulser implements IModeDeplacement{
    @Override
    public void avance(int vitesse) {
            String deplacement = "\u001B[31m";
            for ( int i=0;i<vitesse;i++)
                deplacement +="\uD83D\uDE80"+"\uD83D\uDE80";

            System.out.println( deplacement+ANSI_RESET);

    }
}
