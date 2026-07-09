package JavaPractical.JavaPractice;
import java.util.Scanner;

public class A3_Digit_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Digit: ");
		int digit= sc.nextInt();
		int temp=digit;
		
		int rev=0;
		while(temp != 0) {
			rev = (rev * 10) + (temp % 10);
			temp /=10;	
		}
		
		if(rev==digit)
			System.out.println("Entered Digit is Palindrome!");
		else
			System.out.println("Entered Digit is not Palindrome!");
	}
}
