package JavaPractical.Day1;

import java.util.Scanner;

public class ArmStrong_Number {
	
	public static void main(String[] ar) {
		int digit=0;
		
Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int temp=num;
		int temp1=num;
		int sum=0;
		
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		
		while(temp1>0) {
			int lastDigit=temp1%10;
			sum += (int) Math.pow(lastDigit, digit);
			temp1=temp1/10;			
		}
		
		
		if(sum==num) {
			System.out.println("Number is ArmStrong Number");
		}
		
		else {
			System.out.println("Number is Not a ArmStrong Number");
		}
	}

}
