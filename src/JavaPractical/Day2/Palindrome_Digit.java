package JavaPractical.Day2;

import java.util.Scanner;

public class Palindrome_Digit {
	public static void main(String [] ar) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Digit: ");
		int num=sc.nextInt();
		int temp=num;
		
		int reversed=0;
		while(temp>0) {
			reversed= (reversed * 10) + (temp%10);
			temp=temp/10;
		}
		
		if(num==reversed) {
			System.out.printf("%d is a Palindrome Number", num);
		}
		else {
			System.out.printf("%d is not a Palindrome Number", num);
		}
	}

}
