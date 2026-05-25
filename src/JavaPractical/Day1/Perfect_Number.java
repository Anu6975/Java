package JavaPractical.Day1;
import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println("Number is Perfect Number");
		}
		
		else {
			System.out.println("Number is Not a Perfect Number");
		}

	}

}
