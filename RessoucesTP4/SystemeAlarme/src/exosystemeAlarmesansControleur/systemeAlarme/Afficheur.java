package exosystemeAlarmesansControleur.systemeAlarme;


import exosystemeAlarmesansControleur.observateur.Observateur;

public class Afficheur implements Observateur {


    private boolean allume;


    public void allumer(String type, Capteur capteur) {
        allume=true;
        System.out.println("Nouvelle intrusion, nb intrusions totales : " + capteur.getNbIntrusions());
    }

    public void eteindre() {
        allume=false;
    }

    @Override
    public void mettreAJour(Object o) {
        Capteur capteur = (Capteur) o;
        if (capteur.isIntrusion()) {
            if (!allume)
                allumer(capteur.getType(), capteur);


        } else {
            if (allume)
                eteindre();
        }
    }
}
