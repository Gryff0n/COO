package modele;

public class Client {
    private String login;
    private String mdp;

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    private String nom;


    public Client(String login, String mdp, String nom) {
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
    }



    public String getNom() {
        return nom;
    }



    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
