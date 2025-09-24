package clonage;

import java.util.HashMap;
import java.util.Map;

public class Clone {
    private final int numero;
    private final String nom;
    private final String espece;
    protected int stockEnergie;
    protected int stockOxygene;
    protected final static int MAXENERGIE = 100;
    protected final static int MAXOXYGENE = 200;

    private static final Map<String, Integer> lesNumerosSuivants = new HashMap<>();

    public Clone(String espece) {
        this.espece = espece;
        Integer num =lesNumerosSuivants.putIfAbsent(espece,1);
        if (num == null)
            numero= 1;
        else {
            numero =++num;
            lesNumerosSuivants.put(espece,num++);
        }
        nom = espece+numero;
    }
    public void alimenterEnergie(){
        stockEnergie=50;
    }
    public void oxygener(){
        stockOxygene=100;
    }

    @Override
    public String toString() {
        return "Clone{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", espece='" + espece + '\'' +
                ", stockEnergie=" + stockEnergie +
                ", stockOxygene=" + stockOxygene +
                '}';
    }
}
