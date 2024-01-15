package objects;

public class Formation {
    private String theme_formation;
    private String lieu_formation;
    Soldier soldier;

    //CONSTRUCTORS
    public Formation(){};
    public Formation(String theme_formation, String lieu_formation){
        this.theme_formation = theme_formation;
        this.lieu_formation = lieu_formation;
    }

    //GETTERS & SETTERS
    //GETTERS
    public Soldier getSoldier() {
        return soldier;
    }
    public String getTheme_formation() {
        return theme_formation;
    }
    public String getLieu_formation() {
        return lieu_formation;
    }
    //SETTERS
    public void setSoldier(Soldier soldier) {
        this.soldier = soldier;
    }
    public void setTheme_formation(String theme_formation) {
        this.theme_formation = theme_formation;
    }
    public void setLieu_formation(String lieu_formation) {
        this.lieu_formation = lieu_formation;
    }

    //toString
    @Override
    public String toString(){
        return "Formation{" + "theme = " + theme_formation + ", lieu = " + lieu_formation + ", soldat = " + soldier.toString() + '}';
    }
}
