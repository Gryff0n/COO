package siPaylib;

public class ComptePaylib {
    private String mail;
   private String mdp;
   private int codeSecret;
   private double solde;

    public int getCodeSecret() {
        return codeSecret;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public ComptePaylib(String mail, String mdp, int codeSecret, double solde) {
        this.mail = mail;
        this.mdp = mdp;
        this.codeSecret=codeSecret;
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
                ", codeSecret='" + codeSecret + '\'' +
                ", solde=" + solde +
                '}';
    }
}
