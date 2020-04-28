//This program prompts the user to enter a number, uses a control loop to make sure the number is less than 10 and greater than 0, and prints my name (Ana) to the screen as many times as the number entered.
//Software Development Project - Ana Vieira, 2020.04.28

import java.util.Scanner;

public class Exercise4 {
	
	public static void main (String [] args){
	
        Scanner input = new Scanner(System.in);
        int num = 0;

        //Input + Control Loop
        System.out.print("Enter a number from 1 to 10: ");
        num = input.nextInt();

        while ((num < 1) || (num > 10)) {
            System.out.println("Invalid Number entered. Please try again.");
            System.out.println();
            System.out.print("Enter a number from 1 to 10: ");
            num = input.nextInt();
        }

        System.out.println();

        //Output
        for (int i = 1; i < (num+1); i++){
            System.out.println(i + ". Ana");
        }
	}


}
