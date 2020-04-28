//This program prompts the user to enter a symbol, the number of rows and number of columns. It implements a nested loop to print to the screen a table composed by the symbol entered by the user.
//Software Development Project - Ana Vieira, 2020.04.28

import java.util.Scanner;

public class Exercise6 {
	
	public static void main (String [] args){
	
        Scanner input = new Scanner(System.in);
        char symbol = 0;
        int row = 0;
        int rows = 1;
        int col = 0;
        int cols = 1;

        //Input 
        System.out.print("Enter a symbol: ");
        symbol = input.next().charAt(0);
        System.out.print("Enter number of rows: ");
        row = input.nextInt();
        System.out.print("Enter number of columns: ");
        col = input.nextInt();

        System.out.println();

        //Output
       while ( rows <= row){
			while (cols <= col){
				System.out.print(symbol + " ");
				cols++;
			}
			System.out.println();
			cols = 1;
			rows++;
		}
	}


}
