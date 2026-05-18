/* Taking Flower Input From user and Printing it! */

package Day5;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("How many Flowers You want?: ");
		int flowers = s.nextInt();
		
		//Array Declaration
		String flower[] = new String[24];
		
		//Asking User for Flowers Input
		System.out.println("Enter Flower Names \n");
		for(int i=0; i<flowers; i++) {
			System.out.print("Enter Flower "+ (i+1)+ " ");
			flower[i]=s.next();
		}
		
		
		// Flowers.
		System.out.print("Here ARe Your "+ flowers + " Flowers: ");
		for(int i=0; i<flowers; i++) {
			System.out.print(flower[i]+ " ");
		}
		
	}

}
