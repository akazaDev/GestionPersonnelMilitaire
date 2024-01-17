package actions.onobjects;

import java.util.Scanner;

public class FormAffectation {
    static Scanner scanner = new Scanner(System.in);
    public static void doAffectation(){
        //VERIFIER L'EXISTANCE DU MATRICULE
        //int matricule = verifyMatricule();
        //RETOURNER LE SOLDAT EN QUESTION
        //Soldier soldat;

        System.out.println("Vous etes sur le point d'affecter le soldat : "/*soldat.toString()*/);

        System.out.print("Entrez le lieu de l'affectation : ");
        String lieu = scanner.nextLine();
        System.out.print("Entrez la cause de l'affectation : ");
        String cause = scanner.nextLine();

        //FONCTION SQL POUR AJOUTER UNE AFFECTATION A LA BD
        //ET RETIRER LE SOLDAT DE LA LISTE DES SOLDATS DE LA BASE
    }

    public static void enFormation(){
        //VERIFIER L'EXISTANCE DU MATRICULE
        //int matricule = verifyMatricule();
        //RETOURNER LE SOLDAT EN QUESTION
        //Soldier soldat;

        System.out.println("Vous êtes sur le point d'envoyer le soldat suivant en formation : " /*+ soldat.toString*/);
        System.out.print("Entrez le lieu de la formation: ");
        String lieu = scanner.nextLine();
        System.out.print("Entrez la cause de l'affectation : ");
        String cause = scanner.nextLine();

        //FONCTION SQL POUR AJOUTER UNE AFFECTATION A LA BD
        //ET RETIRER LE SOLDAT DE LA LISTE DES SOLDATS DE LA BASE
    }
}
