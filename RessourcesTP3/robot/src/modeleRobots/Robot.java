package modeleRobots;


public abstract class Robot {
    protected String nom;
    private float position;
    protected int vitesse;
    private IModeDeplacement modeDeplacement;


    protected void nouvellePosition (){
        position= (float) (position+vitesse/60.0*1000);
    }


    public Robot(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;
        this.position=0f;
        this.modeDeplacement =new Marcher();
    }


    abstract public void deplacement(Terrain t);


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    public void setModeDeplacement(IModeDeplacement modeDeplacement) {
        this.modeDeplacement = modeDeplacement;
    }

    public IModeDeplacement getModeDeplacement() {
        return modeDeplacement;
    }


    @Override
    public String toString() {
        return nom + " "+Math.round(position);
    }
}
