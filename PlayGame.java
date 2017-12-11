import java.util.Scanner;

public class PlayGame
{
    static Scanner input = new Scanner(System.in);

    public static int rollDice()
    {
        int bet; // bet that the user places
        int count = 1; // used to end the Do while loop at the end
        Dice dice1 = new Dice(); // gets random integer for dice 1
        Dice dice2 = new Dice(); // gets random integer for dice 2
        Dice dice3 = new Dice(); // gets random integer for dice 3

        int point = 0;

        boolean player1 = false; // used to end the loop
        System.out.println("\nCee-Lo is the game. Rules are 4-5-6 are auto-win. 1-2-3 are auto-lose");
        System.out.println("Two doubles of any number set your point. You point is the 3rd di");
        System.out.println("Rolling 3 of the same number sets TRIPS. TRIPS trumps a set point. Higher trips trump lower trips.");
        System.out.println("\nPlace your bet");
        bet = input.nextInt();
        System.out.println("\nRoll the dice.");

        while (player1  == false)
        {
            //System.out.println("Now");
            //choice = input.nextInt();

            int roll1 = dice1.getRoll(); // rolls the dice from the Dice.java file
            int roll2 = dice2.getRoll();
            int roll3 = dice3.getRoll();

            int rollTotal = roll1 + roll2 + roll3;

            if (rollTotal == 15) // if user rolls a 4,5, or 6 the game ends
            {
                System.out.printf("\ndice are hot. You rolled a %d, %d, and %d.", roll1, roll2, roll3);
                System.out.printf("\nYou won %d", bet);
                player1 = true;
                point = 19;

            }

            else if (rollTotal == 6) // if user rolls a 1, 2, or 3 the game ends
            {
                System.out.printf("\nNot Today You lose. You rolled a %d, %d, and %d", roll1, roll2, roll3);
                player1 = true;
                point = 0;

            }

            else if (roll1 == roll2 && roll2 == roll3)
            {
                System.out.println("You rolled TRIPS!");
                player1 = true;
                point = (roll1 + roll2 + roll3);
            }

            else if (roll1 == roll2)
            {
                System.out.printf("\n You rolled a %d, %d, and a %d. Your point is %d.", roll1, roll2, roll3, roll3);
                player1 = true;
                point = roll3;

            }

            else if (roll1 == roll3)
            {
                System.out.printf("\n You rolled a %d, %d, and a %d. Your point is %d.", roll1, roll3, roll2, roll2);
                player1 = true;
                point = roll2;

            }


            else if (roll2 == roll3)
            {
                System.out.printf("\n You rolled a %d, %d, and a %d. Your point is %d.", roll2, roll3, roll1, roll1);
                player1 = true;
                point = roll1;
            }
            else if (roll1 != roll2 || roll1 != roll3 || roll2 != roll3) // if no doubles are rolled the loop resets itself.
            {
                player1 = false;
            }

        }
        return point;
    }
    }

