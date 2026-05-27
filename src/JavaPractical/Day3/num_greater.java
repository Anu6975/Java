package JavaPractical.Day3;

import java.util.Scanner;

public class num_greater {
	static Scanner sc = new Scanner(System.in);
	
	
	
	static void Two_nums() {
		System.out.print("Enter 2 Numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1+ " is Greater than "+ n2);
		}
		else {
			System.out.println(n2+ " is Greater than "+ n1);
	}
	}
	
	static void three_nums() {
		
		System.out.print("Enter 3 Numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1 > n2 && n1>n3) {
			System.out.println(n1+ " is Greater than "+ n2+ " and "+n3);
		}
		else if(n2>n1 && n2>n3){
			System.out.println(n2+ " is Greater than "+ n1+ " and "+n3);
		}
		
		else {
			System.out.println(n3+ " is Greater than "+ n2+ " and "+n1);
		}
	}

	public static void main(String[] args) {
		System.out.print("1. Compare 2 Numbers \n2. Compare 3 Numbers\nEnter choice(1/2): ");
		int n=sc.nextInt();
		switch (n) {
		case 1: 
			
			Two_nums();
			break;
		
		case 2:
			three_nums();
			break;
			
		default:
			System.out.println("Invalid Input!!");
		}
		
	}

}
