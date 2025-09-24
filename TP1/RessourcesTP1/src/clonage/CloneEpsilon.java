package clonage;

public class CloneEpsilon extends Clone{

    public CloneEpsilon(String espece) {
        super(espece);
    }
    @Override
    public void alimenterEnergie(){
        stockEnergie=MAXENERGIE/3;
    }

    @Override
    public void oxygener(){
        stockOxygene=MAXOXYGENE/3;
    }
}
