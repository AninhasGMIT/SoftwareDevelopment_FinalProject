//This program combines all the previous exercises to create a menu and prompt the user to enter which exercise they want to run.
//Software Development Project - Ana Vieira, 2020.04.28

import java.util.Scanner;

public class Index {
	
	public static void main (String [] args){
	
        Scanner input = new Scanner(System.in);
        int option = 0;

        //User Input
        System.out.print("Select an option (1-8): ");
        System.out.println();
        System.out.println("1. Exercise 1");
        System.out.println("2. Exercise 2");
        System.out.println("3. Exercise 3");
        System.out.println("4. Exercise 4");
        System.out.println("5. Exercise 5");
        System.out.println("6. Exercise 6");
        System.out.println("7. Exercise 7");
        System.out.println("8. Exit");
        option = input.nextInt();
        
        while (option < 1 || option > 8){
            //This checks the user's input.
            System.out.println("Invalid option. Please choose an option from 1 to 8.");
            option = input.nextInt();
        }

        switch (option) {

            case 1:
                System.out.println("Exercise 1");
		        System.out.println();
		        Exercise1.main(null); //Run Exercise1 
                break;

            case 2:
                System.out.println("Exercise 2");
		        System.out.println();
		        Exercise2.main(null); //Run Exercise2 
                break;

            case 3:
                System.out.println("Exercise 3");
		        System.out.println();
		        Exercise3.main(null); //Run Exercise3 
                break;

            case 4:
                System.out.println("Exercise 4");
		        System.out.println();
		        Exercise4.main(null); //Run Exercise4
                break;

            case 5:
                System.out.println("Exercise 5");
		        System.out.println();
		        Exercise5.main(null); //Run Exercise5 
                break;

            case 6:
                System.out.println("Exercise 6");
		        System.out.println();
		        Exercise6.main(null); //Run Exercise6
                break;

            case 7:
                System.out.println("Exercise 7");
		        System.out.println();
		        Exercise7.main(null); //Run Exercise7 
                break;

            case 8:
                System.out.println("Exit");
                System.out.println();


        }

	}

}
