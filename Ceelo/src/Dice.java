/*
	Jamie Steck
	Sep 20, 2017
	Dice.java
	Dice class that can be initialized to n sides and can be "rolled"
	No dependencies
	No credit
*/

import java.util.Random; //class used to generate random number for dice roll

public class Dice
{
    private int numberSides;
    private Random randomGenerator;
    private int currentRoll;

    //default constructor
    Dice()
    {
        randomGenerator = new Random(); //initialize random object
        numberSides = 6; //default number of sides
        currentRoll =  randomGenerator.nextInt(numberSides)+1; //initialize roll (1-6)
    }

    public int getRoll()
    {
        return currentRoll;
    }

    //"roll" a random integer between 1 and numberSides
    public void roll()
    {
        currentRoll =  randomGenerator.nextInt(numberSides)+1; //reroll 1-6
    }
}
