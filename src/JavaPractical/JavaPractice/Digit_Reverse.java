package JavaPractical.JavaPractice;
import java.util.Scanner;

public class Digit_Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Digit: ");
		int digit=sc.nextInt();
		
//		if(digit <10 && digit >= 0 || digit >-10 && digit <= 0)
		if(Math.abs(digit)<10){
			System.out.println("Single Digit, No Reverse!! ");
			return;
		}
		
		int reverse=0;
		while(digit!=0 ) { 						
			reverse = (reverse * 10) + (digit%10);
			digit =	digit/10;
		}
		
		System.out.println("Reversed Digit: "+ reverse);
	}

}
