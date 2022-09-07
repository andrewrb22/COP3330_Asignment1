# COP3330_Asignment1 - Math Game
I would like you to create a program that does the following:

Ask the user how many numbers they would like to generate. User will put in an integer valued from 2 - 25. 
 I will call this variable n. 
Create n random values and store them in an integer array.  These random numbers should be between 5 and 20.

Create a menu that will ask the user if they would like to play game, shuffle, generate new numbers, sort or exit.

If they select play game, display each value in the array and ask the user to add all the values up.   If they enter the correct number, print out a success message.  If it is incorrect print out a message saying they were wrong and what the correct number is.

If they select shuffle, print the current state of the array and ask the user how many times they would like to shuffle.   For each shuffle, randomly select two values and switch their values in the array.   Print out the final state of the array.

If they select generate new numbers, reassign all values in the current array.  Do not create a new array. (Ranges should be 5-20)
If they select sort array, sort the array ascending (1, 2, 3).

If they select exit, end the loop.  Do not use the quit method. 

Create a method that takes in an integer array and prints out the list in a formatted way.