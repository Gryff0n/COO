package main;

import commande.*;
import invocateur.Invocateur;
import modele.DisqueDur;
import modele.Ecran;
import modele.Ordinateur;
import modele.Processeur;

import java.util.Scanner;

public class Main {

    public static void afficherMenu(){
        System.out.println("0. Quitter");
        System.out.println("1. Modifier le nombre de coeurs du processeur ");
        System.out.println("2. Modifier la frequence du processeur");
        System.out.println("3. Modifier la taille de l'écran");
        System.out.println("4. Modifier la capacite du disque dur");
        System.out.println("5. Appliquer les configurations");
        System.out.println("6. Annuler les dernières configurations");
        System.out.println("7: Revenir à la configuration initiale");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Processeur processeur = new Processeur(2.5, 65, 4);
        DisqueDur disqueDur = new DisqueDur(90, 750, 4);
        Ecran ecran = new Ecran("1920*1080", 17);
        Ordinateur ordinateur = new Ordinateur(disqueDur, processeur, ecran);
        Invocateur invocateur = new Invocateur();
        boolean continuer = true;
        System.out.println(ordinateur.toString() + " \n Prix : " + ordinateur.calculPrix());

        while (continuer) {
            afficherMenu();
            int reponse = sc.nextInt();
            switch (reponse) {
                case 1:
                    System.out.println("Donnez le nombre de coeurs du processeur souhaité");
                    int nbCoeurs = sc.nextInt();
                    Commande cmdNbCoeurs = new CommandeNbCoeursProcesseur(processeur, nbCoeurs);
                    invocateur.ajouterCommande(cmdNbCoeurs);
                    break;

                case 2:
                    System.out.println("Donnez la fréquence du processeur souhaitée");
                    double frequence = sc.nextDouble();
                    Commande cmdFrequence = new CommandeFrequenceProcesseur(processeur, frequence);
                    invocateur.ajouterCommande(cmdFrequence);
                    break;

                case 3:
                    System.out.println("Donnez la taille de l'écran souhaitée");
                    int taille = sc.nextInt();
                    Commande cmdTailleEcran = new CommandeTailleEcran(ecran, taille);
                    invocateur.ajouterCommande(cmdTailleEcran);
                    break;

                case 4:
                    System.out.println("Donnez la capacité du disque dur souhaitée");
                    int capacite = sc.nextInt();
                    Commande cmdCapaciteDD = new CommandeCapaciteDisqueDur(disqueDur, capacite);
                    invocateur.ajouterCommande(cmdCapaciteDD);
                    break;

                case 5:
                    invocateur.traiterLesCommandes();
                    System.out.println(ordinateur.toString() + " \n Prix : " + ordinateur.calculPrix());
                    break;

                case 6:
                    invocateur.annulerDerniereSerieConfigurations();
                    System.out.println(ordinateur.toString() + " \n Prix : " + ordinateur.calculPrix());
                    break;

                case 7:
                    invocateur.annuler();
                    System.out.println(ordinateur.toString() + " \n Prix : " + ordinateur.calculPrix());
                    break;

                default:
                    continuer = false;
            }
        }

        sc.close();
    }
}