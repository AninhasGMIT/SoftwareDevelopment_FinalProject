//This program implements a number array containing 10 numbers, outputs the first and last number to the screen, reorganizes the values using a method and prints the reorganized array to the screen.
//Software Development Project - Ana Vieira, 2020.04.28

import java.util.Random; //Import random class

public class Exercise7 {
	
	public static void main (String [] args){

        int [] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Exercise7 m = new Exercise7();
        
        //Print 1st and last numbers to the screen.
        System.out.println("First value: " + x[0]);
        System.out.println("Last value: " + x[9]);

        //Reorganize numbers 
        m.reorganize(x);
        System.out.println();

        //Print reorganized array to screen 
        System.out.println("Reorganized Array:");
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

	}

    public int [] reorganize(int [] numbers){
      //Method that reorganizes the elements of an array
        Random rnd = new Random ();
        
        for (int i = numbers.length -1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);
            //Simple Swap
            int a = numbers[index];
            numbers[index]= numbers[i];
            numbers[i] = a;
        }
        
        return numbers;
    }


}
