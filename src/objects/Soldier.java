package objects;

import java.util.List;

public class Soldier {
    private String nom;
    private String prenom;
    private int matricule;
    private String grade;
    private List<String> competences;

    //CONSTRUCTORS
    public Soldier(){};
    public Soldier(String nom, String prenom, int matricule, String grade, List<String> competences) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.grade = grade;
        this.competences = competences;
    }

    //GETTERS & SETTERS
    //getters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public int getMatricule() {
        return matricule;
    }
    public String getGrade() {
        return grade;
    }
    public List<String> getCompetences() {
        return competences;
    }
    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setCompetences(List<String> competences) {
        this.competences = competences;
    }
    public void ajouterCompetence(String competence) {
        this.competences.add(competence);
    }
    public void supprimerCompetence(String competence) {
        this.competences.remove(competence);
    }

    //toString
    @Override
    public String toString() {
        return "Soldat{" + "nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", grade=" + grade + ", competences=" + competences + '}';
    }
}
