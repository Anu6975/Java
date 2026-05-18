/*   Train Ticket Eligibility   */

import java.util.Scanner;

public class Task3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age= s.nextInt();

		if(age<=5){
			System.out.println("Free Ticket!!");
		}

		else if(age>5  && age <= 18){
			System.out.println("Child Ticket.");
		}
		else if(age>=60){
			System.out.println("Senior Citizen Ticket.");
		}
		else{
			System.out.println("Full Ticket.");
		}
	}
}