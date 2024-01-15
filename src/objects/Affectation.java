package objects;

public class Affectation {
    private String lieu_affectation;
    private String cause_affectation;
    Soldier soldier;

    //CONSTRUCTORS
    public Affectation(){};
    public Affectation(String lieu_affectation, String cause_affectation){
        this.lieu_affectation = lieu_affectation;
        this.cause_affectation = cause_affectation;
    }

    //GETTERS & SETTERS
    //GETTERS
    public Soldier getSoldier() {
        return soldier;
    }
    public String getLieu_affectation() {
        return lieu_affectation;
    }
    public String getCause_affectation() {
        return cause_affectation;
    }
    //SETTERS
    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }
    public void setLieu_affectation(String lieu_affectation) {
        this.lieu_affectation = lieu_affectation;
    }
    public void setCause_affectation(String cause_affectation) {
        this.cause_affectation = cause_affectation;
    }

    //toString
    @Override
    public String toString(){
        return "Affectation{" + "cause = " + cause_affectation + ", lieu = " + lieu_affectation + ", soldat = " + soldier.toString() + '}';
    }
}
