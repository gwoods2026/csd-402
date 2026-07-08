// Garrett Woods Module 8.2 //

import java.util.ArrayList;
import java.util.Scanner;

public class GarrettArrayListTest {


    // configures an empty list
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        
        // tells java where to start looking in the array
        Integer maxVal = list.get(0);


        // finds the largest number
        for (Integer num : list) {
            if (num>maxVal) {
                maxVal = num;
            }
        }

        return maxVal;
    }

    public static void main (String[] args) {


        // gets the values for the list
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to terminate):");

        while(true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                arrayList.add(input);

                if(input == 0) {
                    break;
                }
            } else {
                System.out.println("Please Only Use Numbers");
                scanner.next();
            }
        }

        Integer largestValue = max(arrayList);


        // shows the whole Array and the largest number in the array on its own line
        System.out.println("\nYour Results");
        System.out.println("The ArrayList: " + arrayList);
        System.out.println("The biggest number is: " + largestValue);


        // test to make sure it will not get stuck with an empty list
        System.out.println("\nTesting with an empty Array");
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("This should be 0");
        System.out.println("Empty Array: " + max(emptyList));

        scanner.close();
    }
}
