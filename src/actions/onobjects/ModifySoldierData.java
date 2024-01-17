package actions.onobjects;

import java.util.Scanner;

public class ModifySoldierData {
    static Scanner scanner = new Scanner(System.in);
    public static void modifyMenu(){
        System.out.println("1 - pour modifier le nom ");
        System.out.println("2 - pour modifier le prénom ");
        System.out.println("3 - pour modifier le grade ");
        System.out.println("4 - pour modifier les compétences ");
        System.out.print("Entrez votre choix : ");
        int choix = scanner.nextInt();

        switch (choix){
            case 1:
                //METTRE A JOUR LE NOM
                break;
            case 2:
                //METTRE A JOUR LE PRENOM
                break;
            case 3:
                //METTRE A JOUR LE GRADE
                break;
            case 4:
                //METTRE A JOUR LES COMPETENCES
                break;
            default:
                break;
        }
    }

    public static void updateName(){
        int matricule = verifyMatricule();
        //FONCTION SQL QUI RENVOIES LA PERSONNE
        //Soldier soldat = searchSoldier();
        //System.out.println(soldat);
        System.out.println("l'ancien nom est " /*+ soldat.getNom() */);
        System.out.print("Entrez le nouveau nom : ");
        String name = scanner.nextLine();
        //FONCTION SQL QUI VA PERMETTRE DE METTRE A JOUR LE NOM
    }

    public static void updatePrenom(){
        //int matricule = verifyMatricule();
        //FONCTION SQL QUI RENVOIES LA PERSONNE
        //Soldier soldat = searchSoldier();
        //System.out.println(soldat);
        System.out.println("l'ancien prénom est " /*+ soldat.getPrenom() */);
        System.out.print("Entrez le nouveau prénom : ");
        String prenom = scanner.nextLine();
        //FONCTION SQL QUI VA PERMETTRE DE METTRE A JOUR LE PRENOM
    }

    public static void updateGrade(){
        //int matricule = verifyMatricule();
        //FONCTION SQL QUI RENVOIES LA PERSONNE
        //Soldier soldat = searchSoldier();
        //System.out.println(soldat);
        System.out.println("l'ancien grade est " /*+ soldat.getGrade() */);
        System.out.print("Entrez le nouveau grade : ");
        String grade = scanner.nextLine();
        //FONCTION SQL QUI VA PERMETTRE DE METTRE A JOUR LE GRADE
    }

    public static void updateTricks(){
        //int matricule = verifyMatricule();
        //FONCTION SQL QUI RENVOIES LA PERSONNE
        //Soldier soldat = searchSoldier();
        //System.out.println(soldat);
        System.out.println("Les compétences sont " /*+ soldat.getCompetences() */);
        System.out.print("Entrez les nouvelles compétences : ");
        String competences = scanner.nextLine();
        //Arrays.asList(competences.split(" "))
        //FONCTION SQL QUI VA PERMETTRE DE METTRE A JOUR LE GRADE
    }
}
