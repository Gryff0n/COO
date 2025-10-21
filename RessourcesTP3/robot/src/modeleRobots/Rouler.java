package modeleRobots;

public class Rouler implements IModeDeplacement{

    @Override
    public void avance(int vitesse) {
        String deplacement = "";
        if (vitesse<5) {
           deplacement= "\u001B[36m";
        }
        else
            deplacement ="\u001B[34m";
        for (int i = 0;i<vitesse;i++){
            deplacement+="\uD83D\uDE97";
        }
        deplacement+=ANSI_RESET;
        System.out.println(deplacement);

    }
}
