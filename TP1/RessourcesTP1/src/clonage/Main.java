package clonage;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        CentreClonage centreClonage = new CentreClonage("LeCloneLab","Orleans");
        boolean continuer = true;
        while (continuer) {
            System.out.println("Choisissez l'espèce du clone");
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
