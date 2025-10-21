package siBanque;

public class CB {

    private int numCarte;
    private int annee;
    private int mois;
    private int code;
    private CompteClient compteClient;

    public CB( int numCarte, int annee, int mois, int code, CompteClient compteClient) {
        this.numCarte = numCarte;
        this.annee= annee;
        this.mois=mois;
        this.code = code;
        this.compteClient= compteClient;
    }

    public int getNumCarte() {
        return numCarte;
    }

    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    public int getCode() {
        return code;
    }


    public void enregistrerPaiement (double montant){
        compteClient.debiter(montant);
    }

    public String getNom(){
        return compteClient.getNom();
    }
    @Override
    public String toString() {
        return "CB{" +
                "numCarte=" + numCarte +
                ", annee=" + annee +
                ", mois=" + mois +
                ", code=" + code +
                ", compteClient=" + compteClient +
                '}';
    }
}
