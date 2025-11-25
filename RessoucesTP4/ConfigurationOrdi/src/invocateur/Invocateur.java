package invocateur;

import commande.Commande;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Invocateur {

    private Queue<Commande> lesCommandesATraiter;
    private Deque<Queue<Commande>> pileHistorique;

    public Invocateur() {
        this.lesCommandesATraiter = new ArrayDeque<>();
        this.pileHistorique = new ArrayDeque<>();
    }

    public void ajouterCommande(Commande commande) {
        lesCommandesATraiter.add(commande);
    }

    public void traiterLesCommandes() {
        // Créer une file pour les commandes traitées
        Queue<Commande> commandesTraitees = new ArrayDeque<>();

        // Traiter chaque commande
        while (!lesCommandesATraiter.isEmpty()) {
            Commande commande = lesCommandesATraiter.remove();
            commande.executer();
            commandesTraitees.add(commande);
        }

        // Empiler la file des commandes traitées dans l'historique
        if (!commandesTraitees.isEmpty()) {
            pileHistorique.push(commandesTraitees);
        }
    }

    public void annulerDerniereSerieConfigurations() {
        if (!pileHistorique.isEmpty()) {
            Queue<Commande> dernieresSerie = pileHistorique.pop();

            // Annuler chaque commande de la dernière série
            while (!dernieresSerie.isEmpty()) {
                Commande commande = dernieresSerie.remove();
                commande.annuler();
            }
        }
    }

    public void annuler() {
        // Annuler toutes les configurations présentes dans la pile
        while (!pileHistorique.isEmpty()) {
            annulerDerniereSerieConfigurations();
        }
    }
}