package exosystemeAlarmesansControleur.systemeAlarme;

import exosystemeAlarmesansControleur.observateur.Observable;
import exosystemeAlarmesansControleur.observateur.Observateur;

import javax.management.ObjectName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ControleurIntrusions {
    private Set<String> typesIntrusions;
    private Set<String> typesFinIntrusions;
    private Map<Observable, Set<Observateur>> lesCorrespondances;


    public ControleurIntrusions(){
        typesIntrusions = new HashSet<String>();
        typesFinIntrusions = new HashSet<String>();
        lesCorrespondances = new HashMap<Observable, Set<Observateur>>();
    }

    public void inscrit(Observable observable, Observateur observateur) {
        if(lesCorrespondances.containsKey(observable)){
            lesCorrespondances.get(observable).add(observateur);
        }
        else {
            lesCorrespondances.put(observable, new HashSet<Observateur>());
            lesCorrespondances.get(observable).add(observateur);
        }

    }

    public void radie(Observable observable, Observateur observateur) {
        lesCorrespondances.get(observable).remove(observateur);
    }

    public void notifierObservateurs(Observable observable) {
        if(((Capteur) observable).isIntrusion()) {
            typesIntrusions.add(((Capteur) observable).getType());
        }else {
            typesFinIntrusions.add(((Capteur) observable).getType());
        }
        if(typesIntrusions.size()>=2) {
            for(Observateur observateur : lesCorrespondances.get(observable)) {
                observateur.mettreAJour(observable);
            }
            typesIntrusions.clear();
        }
        else if(typesFinIntrusions.size()>=2) {
            for(Observateur observateur : lesCorrespondances.get(observable)) {
                observateur.mettreAJour(observable);
            }
            typesFinIntrusions.clear();
        }
    }
}
