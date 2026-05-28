package JavaPractical.Day4;

import java.util.Scanner;

public class WeekDays_printing {
	
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Week Number (1-7): ");
		int n= sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("It's Monday");
			break;
			
		case 2:
			System.out.println("It's Tuesday");
			break;
			
		case 3:
			System.out.println("It's Wednesday");
			break;
			
		case 4:
			System.out.println("It's Thurdsay");
			break;
			
		case 5:
			System.out.println("It's Friday");
			break;
			
		case 6:
			System.out.println("It's Saturday");
			break;
			
		case 7:
			System.out.println("It's Sunday");
			break;
			
		default:
			System.out.println("Invalid Input!!");
		}
	}

}
