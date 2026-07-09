package JavaPractical.JavaPractice;
import java.util.Scanner;

public class A1_Digit_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Digit: ");
		int digit = sc.nextInt();
		int count=0;
		
		if(digit==0) {
		System.out.println("Digit Count: 1");
		return;
		}
		
		while(digit != 0) {
			digit=digit/10;
			count++;
		}
		System.out.println("Digit Count: "+ count);	
		
	}
}
