package JavaPractical.Day20;

import java.util.Scanner;

public class String_EndsWithContent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		System.out.print("Enter a String to check: ");
		String check = sc.next();

		if(str.endsWith(check)) 
		System.out.println("String '"+ str + "' Ends With '" +check+ "'");
		else 
			System.out.println("String ' "+ str + "' Does not Ends With:- '" +check+ "'");
	}

}
