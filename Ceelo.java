import java.awt.*;
import java.net.URI;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.io.IOException;

public class Ceelo {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        boolean repeat = true;

        System.out.println("\nCee-Lo is the game. Rules are 4-5-6 are auto-win. 1-2-3 are auto-lose");
        System.out.println("Two doubles of any number set your point. You point is the 3rd di");
        System.out.println("Rolling 3 of the same number sets TRIPS. TRIPS trumps any set point. Higher trips trump lower trips.");

        System.out.println("\n\n Menu ");
        System.out.println("To set/ add players enter '1'");
        System.out.println("To load a game '2'");
        System.out.println("To play a round enter '3'");
        System.out.println("To print the scoreboard press '4'");
        System.out.println("For a tutorial (explicit) on Ceelo enter '5'");
        System.out.println("To quit enter '6'");
        int choice = input.nextInt();

        do {
            switch (choice) {
                case 1: Player.addPlayer();
                    break;
                case 2:
                    ;
                case 3:
                    PlayGame.rollDice();
                    break;
                case 4: // Print Scoreboard
                    break;
                case 5:
                    Video.BrowseURL();
                    break;
                case 6:
                    repeat = false;
                    break;
                default:
                    System.out.println("You entered an invalid choice. Please enter a number 1-6. ");
            }
        } while (repeat == true);

    }
}

