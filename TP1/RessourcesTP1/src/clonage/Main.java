package clonage;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Choisissez le type du clone\n>>>");
        String type = sc.nextLine();
        CentreClonage centreClonage = new CentreClonageAlpha("LeCloneLabALPHA","Orleans");
        switch (type){
            case "alpha":
                break;
            case "epsilon":
                centreClonage = new CentreClonageEpsilon("LeCloneLabEPSILON","Orleans");
                break;
            case "gamma":
                centreClonage = new CentreClonageGamma("LeCloneLabEPSILON","Orleans");
                break;
            default :
                System.out.println("Erreur");
        }
        boolean continuer = true;
        while (continuer) {
            System.out.print("Choisissez l'espèce du clone\n>>>");
            String espece = sc.nextLine();
            if (espece.equals("q"))
                 continuer=false;
            else {
                Clone c = centreClonage.genererClone(espece);
                System.out.println(c);
            }
        }
    }
}