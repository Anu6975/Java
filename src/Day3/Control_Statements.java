package Day3;

import java.util.Scanner;

public class Control_Statements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);

		/* 1. If-else Statement */
		
		System.out.print("Enter a Number: ");
		int num= s.nextInt();
		
		if(num==0) {
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Numbe is not Zero");
		}
		
		
		
		System.out.print("Do u have Ticket? (yes/no): ");
		String isTicket = s.next();
		
		if(isTicket.equals("yes")) {
			System.out.println("Welcome to Metro");
		}
		
		else {
			System.out.println("Access Not Allowed");
		}
		
		
		/* 2. else-if Ladder */
		
		System.out.print("Enter Signal Color: ");
		String signal = s.next();
		
		if(signal.equals("red") || signal.equals("Red") || signal.equals("RED")) {
			System.out.println("Stop!!");
		}
		
		else if (signal.equals("green") || signal.equals("Green") || signal.equals("GREEN")) {
			System.out.println("Go!");
		}
		
		else if(signal.equals("yellow") || signal.equals("Yellow") || signal.equals("YELLOW")) {
			System.out.println("Signal will Turn Red!");
		}
		
		else {
			System.out.println("Please Enter Valid Input!");
		}
		
		
		
		/* 3. Switch */
		
		System.out.println("\n\n1. Red 2. Yellow 3. Green");
		System.out.print("Enter Signal Color (1/2/3): ");
		int signal_color = s.nextInt();
		
		switch(signal_color){
			case 1:
				System.out.println("Stop!!");
				break;

			case 2:
				System.out.println("Signal will Turn Red!");
				break;

			case 3:
				System.out.println("Go!");
				break;
		
			default:
				System.out.println("Invalid Input!");
		}
		
		
		
		System.out.print("Enter Month Number: ");
		int month_num = s.nextInt();
		
		switch(month_num){
			case 1:
				System.out.println("January");
				break;

			case 2:
				System.out.println("February");
				break;

			case 3:
				System.out.println("March");
				break;
		
			case 4:
				System.out.println("April");
				break;
				
			case 5:
				System.out.println("May");
				break;
			
			case 6:
				System.out.println("June");
				break;
				
			case 7:
				System.out.println("July");
				break;
				
			case 8:
				System.out.println("August");
				break;
				
			case 9:
				System.out.println("September");
				break;
				
			case 10:
				System.out.println("October");
				break;
				
			case 11:
				System.out.println("November");
				break;
				
			case 12:
				System.out.println("December");
				break;
				
			default:
				System.out.println("Invalid Input!");
				
		}
		
		
		/* 4. Nested if-else */
		
		System.out.println("Are You Enrolled in Course (yes/no): ");
		String isEnrolled = s.next();
		
		if(isEnrolled.equals("yes")) {
			
			System.out.println("Welcome!!");
			
			System.out.println("Did you complete the Admission Process(yes/no): ");
			String admission_complete = s.next();
			
			if(admission_complete.equals("yes")) {
				System.out.println("You can Complete the Course");
			}
			
			else if(admission_complete.equals("no")) {
				System.out.println("Complete the Admission so u can Complete the Course");
			}
			
			else {
				System.out.println("Invalid Input");
			}
		}
		
		else if(isEnrolled.equals("no")) {
			System.out.println("Please Enroll Asap!");
		}
		
		else {
			System.out.println("Invalid Input");
		}
	}

}
