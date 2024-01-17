package actions.onobjects;

import objects.Soldier;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddDeleteSoldier {
    static Scanner scanner = new Scanner(System.in);
    public static void addSoldier(){
        System.out.print("Entrez le nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prenom : ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez le matricule : ");
        int matricule = scanner.nextInt();
        //METHODE POUR VERIFIER QUE LE MATRICULE N'EXISTE PAS DANS LA DB
        System.out.print("Entrez le grade : ");
        String grade = scanner.nextLine();
        //METHODE POUR VERIFIER QUE CE GRADE EXISTE
        System.out.print("Entrez les compétences(Séparez chaque compétence par un espace) : ");
        String competences = scanner.nextLine();

        Soldier soldier = new Soldier(nom, prenom, matricule, grade, Arrays.asList(competences.split(" ")));
    }

    public static void deleteSoldier(){
        //int matricule = verifyMatricule();
        //METHODE QUI RENVOIE UNE PERSONNE EN FONCTION DE SON MATRICULE
        //Soldier soldat = searchSoldat();
        System.out.println("Etes vous sûre de vouloir supprimer le soldat " + /*soldat.toString + */" ?");
        System.out.print("o pour OUI , n pour NON : ");
        String choix = scanner.nextLine().toLowerCase();

        switch (choix){
            case "o":
                //METHODE POUR SUPPRIMER UNE PERSONNE DE LA BASE DE DONNEES
                break;
            case "n":
                System.out.println("OPERATION ANNULEE !");
                break;
            default:
                System.out.println("choix incorrect :");
                deleteSoldier();
                break;
        }
    }

    /*public static int verifyMatricule(){
        //VERIFIER L'EXISTANCE DU MATRICULE
        //SI IL EXISTE RETOURNER MATRICULE SINON RETOURNER REESAYER
        System.out.print("Entrez le matricule : ");
        int matricule = scanner.nextInt();
        boolean existe = false;
        //METHODE SQL QUI RENVOIE LE TABLEAU DES MATRICULES EXISTANTS
        int[] matricules;//AFFECTER LE TALEAU DES MATRICULES ICI
        try {
            if(matricules.length == 0) throw new Error("La liste est vide");
            for(int i = 0; i < matricules.length; i++){
                if(matricules[i] == matricule) existe = true;
                break;
            }
            if ((!existe)) {
                verifyMatricule();
            }
            return matricule;
        }catch (Exception e){
            System.out.println("Erreur : " + e.getMessage());
        }
    }*/
    public static String verifyGalon(){
        List<String> grades = List.of("caporal", "caporal-chef", "sergent", "sergent-chef", "adjudant", "adjudant-chef", "major", "aspirant");
        //VERIFIER L'EXISTANCE DU GALON ENTRE
        //SI IL EXISTE RETOURNER GALON SINON RETOURNER REESAYER
        System.out.print("Entrez le galon : ");
        String grade = scanner.nextLine();
        boolean existe = false;

        for(String grd : grades){
            if (grd.equals(grade)) {
                existe = true;
                break;
            }
        }
        if ((!existe)) {
            verifyGalon();
        }
        return grade;

    }
    /*public static int verifyNewMatricule(){
        //VERIFIER QU'IL S'AGIT D'UN NOUVEAU MATRICULE
        //SI IL EXISTE REESAYER SINON RETOURNER MATRICULE
        System.out.print("Entrez le matricule : ");
        int matricule = scanner.nextInt();
        boolean existe = false;
        //METHODE SQL QUI RENVOIE LE TABLEAU DES MATRICULES EXISTANTS
        int[] matricules;//AFFECTER LE TALEAU DES MATRICULES ICI
        try {
            if(matricules.length == 0) throw new Error("La liste est vide");
            for(int i = 0; i < matricules.length; i++){
                if(matricules[i] == matricule) existe = true;
                break;
            }
            if (existe) {
                verifyMatricule();
            }
            return matricule;
        }catch (Exception e){
            System.out.println("Erreur : " + e.getMessage());
        }
    }*/
}
