/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: (Give a brief description for each Class)
 * Due: 02/13/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Raushan Oshan
*/

import java.util.Scanner;
import java.util.Random;


public class ESPGame {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Describe yourself: ");
		String yourself = input.nextLine();
		
		System.out.print("Due Date (MM/DD/YY): ");
		String dueDate = input.nextLine();
		System.out.print("CMSC203 Assignment1: Test your ESP skills!\n");
		
		int correctGuesses = 0, round = 1, totalRounds = 11;
		
		Random random = new Random();
		
		while (round<=totalRounds) {
			int randomNum = random.nextInt(7);
			String selectedColour;
			
			switch(randomNum) {
			case 0:
                selectedColour = "Red";
                break;
            case 1:
                selectedColour = "Green";
                break;
            case 2:
                selectedColour = "Blue";
                break;
            case 3:
                selectedColour = "Orange";
                break;
            case 4:
                selectedColour = "Yellow";
                break;
            case 5:
                selectedColour = "Purple";
                break;
            case 6:
                selectedColour = "Pink";
                break;
            default:
                selectedColour = "INVALID"; 
        }
			 	System.out.println("\nRound " + round);
	            System.out.println("I am thinking of a color.");
	            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple, or Pink?");
	            System.out.print("Enter your guess: ");
	            String guess = input.nextLine();
	            
	            System.out.println("\nI was thinking of " + selectedColour);
	            if (guess.equalsIgnoreCase(selectedColour)) {
	                correctGuesses++;
			}
	            round++;
			
		}
		
		System.out.println("\nGame Over\n");
        System.out.println("You guessed " + correctGuesses + " out of " + totalRounds + " colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("Description: " + yourself);
        System.out.println("Due Date: " + dueDate);
		

	}
}