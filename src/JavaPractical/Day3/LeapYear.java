package JavaPractical.Day3;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Valid Year: ");
		int year= sc.nextInt();
		
		if((year%4==0 && year % 100 !=0 ) || year%400==0) {
			System.out.println("Entered Year is a Leap year");
		}
		else
		System.out.println("Entered Year is not a Leap year");
		
		sc.close();
	}
}
