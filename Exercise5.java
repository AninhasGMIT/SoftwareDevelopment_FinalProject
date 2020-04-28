//This program uses a loop to calculate the sum, product and average value of the values contained in a certain array, printing those results to the screen.
//Software Development Project - Ana Vieira, 2020.04.28

import java.util.Scanner;

public class Exercise5 {
	
	public static void main (String [] args){
	
        Scanner input = new Scanner(System.in);
        int[] x = {20, 30, 40, 50};
        int sum = 0;
        double average = 0;
        int product = 1;

        System.out.println("Running Exercise 5.");
        System.out.println();

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
            product = product * x[i];
        }

        average = (sum / x.length);

        //Output
        System.out.println("The sum of the values is: " + sum);
        System.out.println("The product of the values is: " + product);
        System.out.println("The average of the values is: " + average);
       
        System.out.println();
        Index.main(null); //Presents the menu again.
	}


}
