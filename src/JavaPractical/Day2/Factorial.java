package JavaPractical.Day2;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] a) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Digit: ");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=2; i<=num; i++) {
			fact=i*fact;
		}
		System.out.println("Factorail of "+num+": "+ fact);
	}

}
