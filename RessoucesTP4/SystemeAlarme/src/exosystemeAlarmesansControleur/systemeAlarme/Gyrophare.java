package exosystemeAlarmesansControleur.systemeAlarme;


import exosystemeAlarmesansControleur.observateur.Observateur;


public class Gyrophare implements Observateur {
    private boolean allume;


    public void allumer(String type) {
        allume=true;
        System.out.println("Alerte du capteur " + type + ", je m'allume");
    }

    public void eteindre() {
        allume=false;
        System.out.println("Je m'éteins");
    }

    @Override
    public void mettreAJour(Object o) {
        Capteur capteur = (Capteur) o;
        if (capteur.isIntrusion()) {
            if (!allume)
                allumer(capteur.getType());


        } else {
            if (allume)
                eteindre();
        }
    }
}
