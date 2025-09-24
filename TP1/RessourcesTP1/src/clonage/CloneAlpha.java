package clonage;

public class CloneAlpha extends Clone{
    public CloneAlpha(String espece) {
        super(espece);
    }

    @Override
    public void alimenterEnergie(){
        stockEnergie=MAXENERGIE;
    }

    @Override
    public void oxygener(){
        stockOxygene=MAXOXYGENE;
    }
}
