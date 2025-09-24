package jeuNim.main;


import jeuNim.controleur.ControleurJeuNim;
import jeuNim.ihm.Ihm;

public class Main {
    public static void main(String[] args) {
        Ihm ihm = new Ihm();
        ControleurJeuNim controleurJeuNim=new ControleurJeuNim(ihm);
        controleurJeuNim.lancerPartie();
    }
}
