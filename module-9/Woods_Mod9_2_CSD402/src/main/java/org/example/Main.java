// Garrett Woods Module 9.2 //

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creates the array to pull from
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Purple");
        colorList.add("Orange");
        colorList.add("Pink");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Brown");


        //displays the array
        System.out.println("Colors: ");
        for (String color : colorList) {
            System.out.println("- " + color);
        }


        //Allows the user to select a color to see again
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number you want to see again (0-9): ");
        String repeatColor = scanner.nextLine();


        //try loop to ensure selection is valid
        try {
            int index = Integer.parseInt(repeatColor);

            System.out.println("Color at number " + index + " is " + colorList.get(index));
        } catch (Exception e) {
            System.out.println("An Exception has been thrown: Out of Bounds");
        } finally {
            scanner.close();
        }
    }
}
