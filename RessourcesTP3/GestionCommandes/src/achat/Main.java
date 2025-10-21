package achat;

import siPaylib.SIPaylib;
import siPaypal.SIPaypal;
import modele.*;
import siBanque.SIBanque;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SIBanque siBanque= new SIBanque();
        SIPaypal siPaypal= new SIPaypal();
        SIPaylib siPaylib= new SIPaylib();
        String loginClient=null;
        GestionnaireCommande gestionnaireCommande= new GestionnaireCommande();
        System.out.println(gestionnaireCommande.lesCorriges());
        Set<String> lesNomsDesCorriges = gestionnaireCommande.lesNomsDesCorriges();
        String nom = "";
        Set<String> panier= new HashSet<>();
        while (!nom.equals("q")) {
            System.out.println("Saisir un nom de corrigé");
            nom = sc.nextLine();
            if (!nom.equals("q")) {
                if ( lesNomsDesCorriges.contains(nom))
                    panier.add(nom);
                else
                    System.out.println("Nom de corrigé incorrect");
            }
        }
        System.out.println("Saisir votre login");
        loginClient = sc.nextLine();
        System.out.println("Saisir votre mot de passe");
        String mdp = sc.nextLine();
        try {
            gestionnaireCommande.connexion(loginClient,mdp);
            System.out.println("Choisir mode de paiement : Carte bancaire (C) ou Paypal(P) ou Paylib(L) :");
            String rep = sc.nextLine();
            IServicePaiement servicePaiement=null;
            switch (rep) {
                case "C":
                    System.out.println("Saisir le numéro de carte bancaire");
                    int numCarte = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Saisir le nom du client");
                    String nomClient = sc.nextLine();
                    System.out.println("Saisir l'année d'expiration");
                    int annee = sc.nextInt();
                    System.out.println("Saisir le mois d'expiration");
                    int mois = sc.nextInt();
                    System.out.println("Saisir le code à 3 chiffres");
                    int code = sc.nextInt();
                    //création du service de paiement CB
                    servicePaiement= ;
                    break;
                case "P":
                    System.out.println("Saisir le mail");
                    String mail = sc.nextLine();
                    System.out.println("Saisir le mot de passe");
                    String mdpPaypal = sc.nextLine();
                    //création du service de paiement paypal
                    servicePaiement= ...;
                    break;
                case "L":
                    System.out.println("Saisir le mail");
                    String email = sc.nextLine();
                    System.out.println("Saisir le mot de passe");
                    String mdpPaylib = sc.nextLine();
                    System.out.println("Saisir le code à 6 chiffres");
                    int codeSecret = sc.nextInt();
                    sc.nextLine();
                    //crétaion du service de paiement paylib
                    servicePaiement= ...;
                    break;
                default:
                    System.out.println("Erreur de saisie");

            }
            //mise à jour du service de paiement dans gestionnaireCommande
            ...

            //passer commande et afficher un message d'erreur si le paiement est impossible
            ...

            System.out.println(siBanque.toString());
            System.out.println(siPaypal.toString());
            System.out.println(siPaylib.toString());
            System.out.println(gestionnaireCommande.recapCommandes());


        } catch (ConnexionImpossibleException e) {
            System.out.println(e.getMessage());
        }




    }




}
