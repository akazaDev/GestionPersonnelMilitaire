package main;

import java.sql.*;
import java.util.Scanner;

public class App {
    //INFORMATIONS DE CONNECTIONS A LA BASE DE DONNEES
    public  static String url = "jdbc:postgresql://localhost:5432/jdbc";
    public static String user = "postgres";
    public static String password = "MagentA#10";

    //METHODE MAIN
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    //MENU PRINCIPALE
    public static void start() {
        int choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenu sur le Programme de gestion de Personnel Militaire");
        System.out.println("1 - Ajouter un soldat");
        System.out.println("2 - Supprimer un soldat");
        System.out.println("3 - Modifier les infos d'un soldat");
        System.out.println("5 - Menu des affectations");
        System.out.println("6 - Menu des formations");
        System.out.println("7. Afficher la liste des soldat");
        System.out.println("Choisissez une option: ");

        while (true) {
            System.out.print("Votre choix: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 5:
                    System.out.println("Merci d'avoir utilisé le Programme de gestion de Personnel Militaire");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide");
            }
        }
    }

    public static Connection connect(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connected successfully!!!!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        return connection;
    }
}
