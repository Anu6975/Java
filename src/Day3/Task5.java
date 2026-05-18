/*  Swiggy Offer */

import java.util.Scanner;

public class Task5{
	public static void main( String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Your Order Amount");
		int amount = s.nextInt();

		if(amount>500) 
			System.out.println("20% Discount Coupon Code is Available for you!!");
		
		else if (amount > 300)
			System.out.println("You can Get 10% on avail amount!" );
		else
			System.out.println("No Offer Available for You!");
	}

}