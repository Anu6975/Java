package JavaPractical.JavaPractice;
import java.util.Scanner;

public class A4_Digit_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Digit: ");
		int digit= sc.nextInt();
		int temp=digit;
		int sum=0;
		
		while(digit != 0) {
			sum = sum + (digit % 10);
			digit /=10;
		}
		System.out.println("Sum of Digit " + temp + " is: "+sum);
	}
}