package JavaPractical.Day2;

import java.util.Scanner;

public class Reverse_Digit {
	
	static void Reverse_mathLogic(int num) {
		
		//Using Math Logic
		int reversed_digit=0;
		while(num>0) {
			reversed_digit=(reversed_digit * 10) + (num%10);
			num=num/10;
		}
		System.out.println(reversed_digit);	
	}
	
	
	static void Reversed_StringBuilderLogic(int num) {
		
		//Using String Builder append method
		StringBuilder reversed = new StringBuilder();
		while(num>0) {
			reversed.append(num%10) ;
			num= num/10;
			}
		
		System.out.println(reversed);	
	}
	
	public static void main(String [] arf)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Digit: ");
		int num=sc.nextInt();
		
		Reversed_StringBuilderLogic(num);
		Reverse_mathLogic(num);
		
	}

}
