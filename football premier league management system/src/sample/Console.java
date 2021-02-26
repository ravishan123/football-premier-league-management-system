package sample;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Console {
    public static  void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        System.out.println("_________________________________________________________________ Premier League Manager __________________________________________________________________________________________________________________________________ ");

        LeagueManager preman = new PremierLeagueManager();



        preman.loadDate();
        preman.loadMatchData();






        while (true) {



            System.out.println("\nEnter 1 to add a football club  ");
            System.out.println("Enter 2 to delete football club  ");
            System.out.println("Enter 3 to statics for football club ");
            System.out.println("Enter 4 to premier league table ");
            System.out.println("Enter 5 to update a Match details ");
            System.out.println("Enter 6 to Open GUI ");
            System.out.println("Enter 7 to Match Played table\n");
            System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________\n");
            System.out.print("Enter your choice: ");
            System.out.println("");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1) {
                preman.addFootballClub();

            } else if (choice == 2) {
                preman.deleteSportsClub();

            } else if (choice == 3) {
                preman.searchOneClub();

            } else if (choice == 4) {
                preman.allClubTable();
                preman.OpenGUI();

            }
             else if (choice == 5) {
                preman.updateDetails();

            }
            else if (choice == 6) {
                preman.OpenGUI();

            }
            else if (choice == 7) {
                preman.allMatchPlayedData();

            }



            System.out.print("\nDo you want to terminate the program ? (y/n) ");
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            if (answer.equals("y")) {
                preman.savefileData();

                break;


            }

        }
    }
}
