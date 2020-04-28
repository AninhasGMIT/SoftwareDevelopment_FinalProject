//This program prompts the user to enter two numbers and performs a series of arithmetic, printing the result to the screen.
//Software Development Project - Ana Vieira, 2020.04.25


import java.util.Scanner;

public class Exercise2 {
	
	public static void main (String [] args){
	
		Scanner input = new Scanner(System.in);
        int num1, num2 = 0;
        
        System.out.println("Running Exercise 2.");
        System.out.println();
		
		//Prompt for Input
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		System.out.println();
		
		//Output
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    
        System.out.println();
        Index.main(null); //Presents the menu again.
	}


}
