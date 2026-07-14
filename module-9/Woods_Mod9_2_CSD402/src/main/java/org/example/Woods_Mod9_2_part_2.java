//Garrett Woods Module 9.2 Program 2

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Woods_Mod9_2_part_2 {
    public static void main(String[] args) {
        String fileName = "random_Numbers.file";
        File file = new File(fileName);


        //sees if there is a file already created and if not it will create one
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("\nFile created: " + file.getName());
            } else {
                System.out.println("\nFile already exists. Appending data.");
            }

            //creates and writes the 10 random numbers to a file
            FileWriter writer = new FileWriter(file, true);
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + " ");
            }

            writer.close();
            System.out.println("\n10 random numbers appended to the file.\n");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.next() + " ");
            }

            System.out.println();

            fileScanner.close();

          //added a catch for error handling
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}