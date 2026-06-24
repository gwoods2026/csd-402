// Garrett Woods Module 5.2

class MinMaxArray {


    // Gets the largest element in the array and it's location
    public static int [] getLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Gets the largest element in the array and it's location
    public static int [] getLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Gets the smallest element in the array and it's location
    public static int [] getSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam [0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam.length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Gets the smallest element in the array and it's location
    public static int [] getSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam [0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam.length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Set up Arrays
    public static void main(String[] args) {
        int[][] intArray = {
                {5, 4, 7},
                {3, 2, 9},
                {1, 6, 8}
        };

        double[][] doubleArray = {
                {1.9, 2.8, 3.7},
                {4.6, 5.5, 6.4},
                {7.3, 8.2, 9.1}
        };

        //Calls the scripts
        int[] maxDouble = getLargest(doubleArray);
        int[] maxInt = getLargest(intArray);
        int[] minDouble = getSmallest(doubleArray);
        int[] minInt = getSmallest(intArray);

        //Displays the results
        System.out.println("Highest Int Number: " + maxInt[0] + ", " + maxInt[1]);
        System.out.println("Lowest Int Number: " + minInt[0] + ", " + minInt[1]);
        System.out.println("Highest Decimal: "+ maxDouble[0] + ", " + maxDouble[1]);
        System.out.println("Lowest Decimal: "+ minDouble[0] + ", " + minDouble[1]);
    }
}