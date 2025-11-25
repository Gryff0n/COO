package exosystemeAlarmesansControleur.systemeAlarme;

import exosystemeAlarmesansControleur.observateur.Observable;
import exosystemeAlarmesansControleur.observateur.Observateur;


import java.util.ArrayList;
import java.util.List;

public class Capteur implements Observable {
    private String type;
    private boolean intrusion;
    private int nbIntrusions;
    private ControleurIntrusions controleurIntrusions;
    private List<Observateur> observateurs;

    public boolean isIntrusion() {
        return intrusion;
    }

    public int getNbIntrusions() {
        return nbIntrusions;
    }
    public String getType() {
        return type;
    }

    public Capteur(String type, ControleurIntrusions controleurIntrusions) {
        this.type = type;
        observateurs= new ArrayList<>() ;
        this.controleurIntrusions =  controleurIntrusions;
    }

    @Override
    public void attacher(Observateur o) {
        controleurIntrusions.inscrit(this,o);
    }

    @Override
    public void detacher(Observateur o) {
        controleurIntrusions.radie(this,o);
    }

    @Override
    public void notifierObservateurs() {
        controleurIntrusions.notifierObservateurs(this);
    }

    @Override
    public String toString() {
        return "Capteur{" +
                "type='" + type + '\'' +
                '}';
    }
    public void intrusion(){
        this.intrusion = true;
        nbIntrusions++;
        notifierObservateurs();
    }
    public void finIntrusion(){
        this.intrusion = false;
        notifierObservateurs();
    }
}
