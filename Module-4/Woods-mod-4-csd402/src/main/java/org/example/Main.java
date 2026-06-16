//Garrett Woods Module 4.2 CSD 402

import java.util.Arrays;

class AverageCalculator {
    //short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    //int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    //long array
    public static long average(long[] array) {
        int sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //double array
    public static double average(double[] array) {
        int sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}

public static void main(String[] args) {

    //The arrays for the different Overload methods
    short[] shortArray = {50, 781, 543};
    int[] intArray = {2, 4, 6, 8};
    long[] longArray = {1, 3, 5, 7, 9};
    double[] doubleArray = {0.5, 1.2, 1.5, 1.7, 1.9, 2.2};

    //Runs the calculations and displays the results
    System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    System.out.println("      Averages of the Arrays    ");
    System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

    System.out.println("Short Array: " + Arrays.toString(shortArray));
    System.out.println("Average: " + AverageCalculator.average(shortArray));
    System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

    System.out.println("Int. Array: " + Arrays.toString(intArray));
    System.out.println("Average: " + AverageCalculator.average(intArray));
    System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

    System.out.println("Long Array: " + Arrays.toString(longArray));
    System.out.println("Average: " + AverageCalculator.average(longArray));
    System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

    System.out.println("Double Array: " + Arrays.toString(doubleArray));
    System.out.println("Average: " + AverageCalculator.average(doubleArray));
    System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
}