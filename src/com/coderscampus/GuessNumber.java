package com.coderscampus;

//needed for the random object so it could be uses
import java.util.Random;

//used for the ability to input information with system in 
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// output display
		System.out.println("Example Output #1");
		System.out.println("\n");
		// provide away to input information
		Scanner input = new Scanner(System.in);
		Random randomCpu = new Random();
//		Integers to describe range of min & max for nextInt class for inclusive to exclusive
		int min = 1;
		int max = 100;
		int randomInputCpu = randomCpu.nextInt(max - min) + min;
		// for practice purposes I printed the random cpu number so I could test my code
		// more accurately - it can be removed any time without
		// affecting the code
		System.out.println(randomInputCpu);
		System.out.println();
		// while loop initializer
		int mathPlus = 1;

		// while loop iterates through 5 attempts - which is related to the user chances
		// at guessing correctly
		while (mathPlus <= 5) {
			// used .print instead of .println so the input number would appear after the :
			System.out.print("Please pick a number between 1 and 100: ");
			String userInput = input.nextLine();
			System.out.println();
			// converts the string input to a number ever though it was a numerical value
			Integer convertInputUser = Integer.parseInt(userInput);

			if (convertInputUser == randomInputCpu) {
				System.out.println("\nYes, You win!!!!");
				break;
			} else if (mathPlus == 5) {
				System.out.println("\nYou Lose!!!!\nThe number to guess was: " + randomInputCpu);
//				break;
			} else if (convertInputUser < 1 || convertInputUser > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again!!");
				// I added the next two lines just to see if it was possible
			} else if (randomInputCpu == (convertInputUser + 10)) {
				System.out.println("You're 10 points Lower than the cpu generator!");
			} else if (convertInputUser == (randomInputCpu + 10)) {
				System.out.println("You're 10 points Higher than the cpu generator!");
				// the above code was not required but added in to see if it was possible
			} else if (convertInputUser > randomInputCpu) {
				System.out.println("Incorrect, please pick a lower number!");
			} else {
				System.out.println("Oh No, please pick a higher number!");
			}
			mathPlus++;

		}

	}

}
