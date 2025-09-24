package clonage;

public class CloneGamma extends Clone{
    public CloneGamma(String espece) {
        super(espece);
    }

    @Override
    public void alimenterEnergie(){
        stockEnergie=MAXENERGIE/2;
    }

    @Override
    public void oxygener(){
        stockOxygene=MAXOXYGENE/2;
    }
}
