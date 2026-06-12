//Garrett Woods Module 2 Assignment

import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //This sets up the random selection for the computer
        Random randomGenerator = new Random();
        int computerSelection = randomGenerator.nextInt(3) + 1;

        //Outputs the welcome and instructions
        System.out.println("Rock, Paper, Scissors");
        System.out.println("Everybody's Favorite Way");
        System.out.println("To Pass the Time!");
        System.out.println();
        System.out.println("Type 1 for Rock.");
        System.out.println("Type 2 for Paper");
        System.out.println("Type 3 for Scissors");
        System.out.println("What are you choosing?: ");

        //saves the selection
        int userSelection = input.nextInt();

        //checks to make sure it's a valid input
        if (userSelection < 1 || userSelection > 3 ) {
            System.out.println("Please pick either 1, 2, or 3");
            input.close();
            return;
        }

        //calls the command to convert number to text
        String computerChoice = convertChoiceToText(computerSelection);
        String userChoice = convertChoiceToText(userSelection);

        //shows your selection along with the computers
        System.out.println();
        System.out.println("You chose " + userChoice);
        System.out.println("The Computer chose " + computerChoice);
        System.out.println();

        //figures out who wins
        if (userSelection == computerSelection) {
            System.out.println("It's a tie! At least you didn't loose");
        } else if ((userSelection == 1 && computerSelection == 3) ||
                   (userSelection == 2 && computerSelection == 1) ||
                   (userSelection == 3 && computerSelection == 2)) {
            System.out.println("You Won! Way to guess.");
        } else {
            System.out.println("Womp Womp. The Computer wins this time.");
        }
        input.close();
    }

    //converts number to text
    public static String convertChoiceToText(int choice) {
        switch(choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}