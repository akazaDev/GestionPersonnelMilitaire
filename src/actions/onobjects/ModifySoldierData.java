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
                break;
        }
    }
}
