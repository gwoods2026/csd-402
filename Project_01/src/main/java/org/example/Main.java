//Garrett Woods
//6-3-2026
//Module 1.3

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterAmount = input.nextDouble();

        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature of the water in Celsius: ");
        double finalTemp = input.nextDouble();

        double q = waterAmount * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed to heat the water is " + q +" Joules.");

        input.close();
    }