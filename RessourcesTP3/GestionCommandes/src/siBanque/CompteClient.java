package siBanque;

public class CompteClient {
    private int numClient;
   private String nom;
   private double solde;
    private static int numSuivant = 10;
    public CompteClient(String nom, double solde)
    {   numClient = numSuivant;
        numSuivant +=10;
        this.nom=nom;
        this.solde=solde;
    }

    public String getNom() {
        return nom;
    }

    public int getNumClient() {
        return numClient;
    }


    public double getSolde() {
        return solde;
    }
    public void debiter(double montant){
        solde -=montant;
    }
    public void crediter (double montant){
        solde +=montant;
    }

    @Override
    public String toString() {
        return "CompteClient{" +
                "numClient='" + numClient + '\'' +
                ", nom='" + nom + '\'' +
                ", solde=" + solde + "}";

    }
}
