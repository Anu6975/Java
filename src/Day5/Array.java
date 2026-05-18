package Day5;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		/* 1. Single Dimensional Array */
		
		
		//Declaring Without Size of Array
		int roll_no[] = {10, 20, 30, 40};
		System.out.println(" "+ roll_no);    						//Prints Address of Array
		System.out.println("Length Array: "+ roll_no.length); 		// Prints Length
		
		for (int i=0; i < (roll_no.length); i++ ) {
			System.out.print(" "+ roll_no[i]);							// Printing Array Elements
		}
		
		System.out.println("\n");
		
		
		//Declaring with Fixed Size
		float marks[] = new float[3];
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter Mark1: "); 			// User-Input of Array Elements
			marks[i]= s.nextFloat();
		}
		
		System.out.println("Entered Marks: ");
		for(int i=0; i<3; i++) {
			System.out.print(marks[i]+ " ");						// Printing Array Elements
		}
		
		
		System.out.println("\n");
		
		
		/* Two Dimensional Array */
		
		//Declaring Without Size
		char alphabet[][] = { {'M' , 'y'},
							  {'A' , 'n'}
		                    };
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(" "+ alphabet[i][j]);
			}
			System.out.println();
		}
	
		
		//Declaring with fixed size
		
		
		
		
		
		
		/* Multi-Dimensional Dimension */
		
	}

}
