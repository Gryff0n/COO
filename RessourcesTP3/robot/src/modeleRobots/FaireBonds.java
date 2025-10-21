package modeleRobots;

public class FaireBonds implements IModeDeplacement{

    @Override
    public void avance(int vitesse) {
        String deplacement = "\u001B[35m";
        deplacement += "\uD83E\uDD98"+"\uD83E\uDD98";

        System.out.println(deplacement + ANSI_RESET);
    }
}
