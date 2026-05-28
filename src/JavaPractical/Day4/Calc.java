package JavaPractical.Day4;

import java.util.Scanner;

public class Calc {
	
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("**Enter The Operation to perform**\n1. Addition 2. Subtraction 3. Multiplication 4. Division"
				+ "\n\nEnter Your Choice ('+'/'-'/'*'/ '/'): ");
		
		char sign = sc.next().charAt(0);
		
		System.out.print("\nEnter 2 Numbers: ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		switch(sign) {
			case '+':
				System.out.println("Addition: "+ (n1+n2));
				break;
				
			case '-':
				System.out.println("Subtraction: "+ (n1-n2));
				break;
				
			case '*':
				System.out.println("Multiplication: "+ (n1*n2));
				break;
				
			case '/':
				System.out.println("Division: "+ (n1/n2));
				break;
				
			default:
				System.out.println("Invalid Sign Input! Try Again!!");
				
			
		}
		
	}
}
