package siPaypal;

public class Compte {
    private String mail;
   private String mdp;
   private double solde;

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public Compte(String mail, String mdp, double solde) {
        this.mail = mail;
        this.mdp = mdp;
        this.solde = solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
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
                "mail='" + mail + '\'' +
                ", mdp='" + mdp + '\'' +
                ", solde=" + solde +
                '}';
    }
}
