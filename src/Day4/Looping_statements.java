package Day4;
import java.util.Scanner;

public class Looping_statements {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		/* 1. While Loop */
		int i=1;
		while(i<=10) {
			System.out.print(i+ " ");
			i++;
		}
		
		// Count number in a digit
		int num=1234;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println("\n"+count);
		
		
		//Sum of numbers in a digit
		int sum=0;
		System.out.print("Enter the a Digit: ");
		int digit = s.nextInt();
		
		while(digit>0) {	
			sum=sum+(digit%10);
			digit=digit/10;
		}
		System.out.println(sum);
		
		
		
		
		/* 2. Do-While Loop */
		System.out.print("Enter Your Name: ");
		String name = s.next();
		i=1;
		do {
			System.out.println(i+". "+name);
			i++;
		}while(i<=2);
		
		//print odd number series
		int number=1;
		
		do {
			if(number % 2 != 0) {
				System.out.print(number+" ");
			}
			number++; 
			
		}while(number!= 20);
		
		
		/* 3. For Loop */
		
		System.out.print("\nEnter Starting to Print Reverse number: ");
		int start= s.nextInt();
		System.out.print("Enter Last Number: ");
		int last= s.nextInt();
		
		for(i=start; i>=last; i--) {
			System.out.print(i +" ");
		}
		
		int prime_num=7;
		count=0;
		
		//Check Number is Prime or not
		
		for(i=2; i<prime_num; i++) {
			if(prime_num %i == 0) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("Number is not Prime");
		}
		else {
			System.out.println("Number is Prime");
		}
	}

}
