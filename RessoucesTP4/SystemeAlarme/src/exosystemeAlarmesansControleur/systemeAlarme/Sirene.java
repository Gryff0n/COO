package exosystemeAlarmesansControleur.systemeAlarme;

import exosystemeAlarmesansControleur.observateur.Observable;
import exosystemeAlarmesansControleur.observateur.Observateur;


public class Sirene implements Observateur {
    private boolean enMarche;


    public void emettreSon(String type) {
        enMarche=true;
        System.out.println("Alerte du capteur " + type + ", je retentis");
    }

    public void arreter() {
        enMarche=false;
        System.out.println("Je m'arrête de sonner");
    }

    @Override
    public void mettreAJour(Object o) {
        Capteur capteur = (Capteur) o;
        if (capteur.isIntrusion()) {
            if (!enMarche)
                emettreSon(capteur.getType());
        } else {
            if (enMarche)
                arreter();
        }
    }

}
