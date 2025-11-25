package exosystemeAlarmesansControleur.systemeAlarme;

public class Main {
    public static void main (String[] args){

        ControleurIntrusions controleurIntrusions = new ControleurIntrusions();
        Capteur capteurContact = new Capteur("contact", controleurIntrusions);
        Capteur capteurDoppler = new Capteur("doppler", controleurIntrusions);
        Capteur capteurInfraRouge = new Capteur("infraRouge", controleurIntrusions);
        Gyrophare gyrophare = new Gyrophare();
        capteurContact.attacher(gyrophare);
        capteurDoppler.attacher(gyrophare);
        capteurInfraRouge.attacher(gyrophare);
        Sirene sirene = new Sirene();
        capteurContact.attacher(sirene);
        capteurDoppler.attacher(sirene);
        capteurInfraRouge.attacher(sirene);
        Afficheur afficheur= new Afficheur();
        capteurContact.attacher(afficheur);
        capteurDoppler.attacher(afficheur);
        capteurInfraRouge.attacher(afficheur);


        capteurContact.intrusion();
        capteurDoppler.intrusion();
        capteurContact.finIntrusion();
        capteurInfraRouge.intrusion();
        capteurInfraRouge.finIntrusion();
        capteurDoppler.finIntrusion();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        capteurDoppler.intrusion();
        capteurInfraRouge.intrusion();
        capteurContact.intrusion();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        capteurDoppler.finIntrusion();
        capteurInfraRouge.finIntrusion();
        capteurContact.finIntrusion();

    }
}
