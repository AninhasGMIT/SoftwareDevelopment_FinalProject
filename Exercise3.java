//This program prompts the user to enter a number, checks if that number is greater, less or equal to my age (20) and prints that information to the screen.
//Software Development Project - Ana Vieira, 2020.04.28


import java.util.Scanner;

public class Exercise3 {

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
		int num = 0;
		int age = 20; //My age.

		//Prompt for Input
		System.out.print("Enter a number: ");
		num = input.nextInt();

		System.out.println();

		//Check Condition + Output
		if (num > age) {
			System.out.println("The number entered is greater than my age.");
		} else if (num < age) {
			System.out.println("The number entered is less than my age.");
		} else {
			System.out.println("The number entered matches my age!");
		}
    
	}

}
