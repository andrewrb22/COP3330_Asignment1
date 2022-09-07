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
 
   public static void main(String[] args) {
   
   
    
    Scanner scan = new Scanner(System.in);
    

    //Welcome and size of array
    System.out.println("Welcome to random number generator!");
    System.out.println("How many values would you like to use:");
      int size = scan.nextInt();
        
      int[] values;
      values = new int[size];

      System.out.println("Created!");
      System.out.println("Your array is the: " + values.length + " Values");  
    




    //Options while loop 

    





       scan.close(); 
    }
 }