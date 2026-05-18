/*  Uber Cab Booking Fare!  */

import java.util.Scanner;

public class Task3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Distance Till Destination (in Km): ");
		float distance = s.nextFloat();

		System.out.println("Select Current Time Zone:      1. 11pm - 6am	 2. 6am-10pm");
		System.out.print("Enter Here (1/2): ");
		int time = s.nextInt();
		switch(time){
			case 2: 
			
			if( distance <= 5.0){
				System.out.println("Rs. 150");
			}
			else if (distance < 15 && distance >5){
				System.out.println("Rs. 300");
			}
			else{
				System.out.println("Rs. 800");
			} break;

			case 1:
			System.out.println("Extra Nigh Charges will be applied");
			if( distance <= 5.0){
				System.out.println("Rs. 150+20");
			}
			else if (distance < 15 && distance >5){
				System.out.println("Rs. 300 + 50");
			}
			else{
				System.out.println("Rs. 800 + 80");
			} break;

			default:

				System.out.println("Invalid Input");

		}	
	}


}