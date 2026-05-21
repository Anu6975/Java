package Day5;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
//		/* 1. Single Dimensional Array */
//		
//		
//		//Declaring Without Size of Array
//		int roll_no[] = {10, 20, 30, 40};
//		System.out.println(" "+ roll_no);    						//Prints Address of Array
//		System.out.println("Length Array: "+ roll_no.length); 		// Prints Length
//		
//		for (int i=0; i < (roll_no.length); i++ ) {
//			System.out.print(" "+ roll_no[i]);						// Printing Array Elements
//		}
//		
//		System.out.println("\n");
//		
//		
//		//Declaring with Fixed Size
//		float marks[] = new float[3];
//		
//		for(int i=0; i<3; i++) {
//			System.out.print("Enter Mark1: "); 						// User-Input of Array Elements
//			marks[i]= s.nextFloat();
//		}
//		
//		System.out.println("Entered Marks: ");
//		for(int i=0; i<3; i++) {
//			System.out.print(marks[i]+ " ");						// Printing Array Elements
//		}
//		
//		
//		System.out.println("\n");
//		
//		
//		/* 2. Two Dimensional Array */
//		
//		//Declaring Without Size
//		char alphabet[][] = { {'M' , 'y'},
//							  {'A' , 'n'}
//		                    };
//		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(" "+ alphabet[i][j]);				// Printing Array Elements
//			}
//			System.out.println();
//		}
//	
//		System.out.println();
//		
//		//Declaring with fixed size
//		String name[] =new String[22];
//		for(int i=1; i<=3; i++) {
//			System.out.print("Enter Name "+i+" :");
//			name[i]=s.next();
//		}
//		
//		System.out.println("Entered Names are: ");
//		for(int i=1; i<=3; i++) {
//			System.out.println(i+"."+ name[i]);						// Printing Array Elements
//		}
		
		
		
		
		/* 3. Multi-Dimensional Dimension */
		int[][][] arr= { { {1, 2}, {3, 4}}, 
						{  {5, 6}, {7, 8}}, 
						{  {9, 10}, {11, 12} }
						};
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				for(int k=0; k<2; k++) {
					System.out.print(" "+ arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
