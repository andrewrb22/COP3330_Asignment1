import java.util.Scanner;

/*
 * Andrew Rodriguez
 * Assignment_1 - MathGame
 * September 07, 2022
 * COP3330
 */

/**
 * MathGame
 */
public class MathGame {

    public static void printNumbers(int[] g) {
        // Print new random values
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }
        

    }

    public static void swapping(int[] g, int pos1) {

        int temp = g[pos1];
        g[pos1] = g[0];
        g[0] = temp;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] values;
        values = new int[10];
        // Welcome and size of array
        System.out.println("\nWelcome to random number generator!");
        System.out.println("How many values would you like to use:");
        int size = scan.nextInt();
        System.out.println("Created!");

        values = new int[size];
        // Assign random numbers to array values
               for (int i = 0; i < values.length; i++) {
                values[i] = (int) (Math.random() * 6) + 1;

            }

        int choice = 0;
        // Options while loop
        while (choice != 5) {

            // Menu

            System.out.println("Select Your Options:");
            System.out.println("1. Play Game");
            System.out.println("2. Swap Values");
            System.out.println("3. New Values");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            choice = scan.nextInt();

            if (choice == 1) { // Option 1 - Play Game

                System.out.println("\nAdd these values:");

         
                // print values call here//

                printNumbers(values);

                // Sum of new values
                int sum = 0;
                for (int i = 0; i < values.length; i++) {
                    sum += values[i];
                }
                // Ask user for sum
                System.out.println("\nEnter your answer:");
                int userSum = scan.nextInt();
                if (userSum == sum) {
                    System.out.println("That is correct!\n");
                } else {
                    System.out.println("That was incorrect. The value adds to be:" + sum + "\n");

                }
            }

            if (choice == 2) {
                System.out.println("Current:");
                printNumbers(values);
                System.out.println("How many swaps?");
                int swaps = scan.nextInt();

                swapping(values, swaps);
                System.out.println("Final: ");
                printNumbers(values);

            }

            if (choice == 3){

                System.out.println("New Values:");
                
                //Assign new values to array

                for (int i = 0; i < values.length; i++) {
                    values[i] = (int) (Math.random() * 6) + 1;
                }
                //print new values
                printNumbers(values);
                
            }

        }

        // Options while loop

        scan.close();
    }
}