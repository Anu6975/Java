package JavaPractical.Day3;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class CharCheck {
	
	public static void main(String [] a) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character: ");
		char c = sc.next().charAt(0);
		
//		if(c>= 'A'&& c<'Z' || c>= 'a'&& c<'z') {
//			System.out.println("Entered Character is Alphabet!");
//		}
//		
//		else if(c>= '0'&& c<'9') {
//			System.out.println("Entered Character is a Number!");
//		}
//		
//		else {
//			System.out.print("Entered Character is Symbol!");
//		}
		
		if (Character.isAlphabetic(c)) {
			System.out.println("Entered Character is Alphabet!");
		}
		else if (Character.isDigit(c)) {
			System.out.println("Entered Character is a Number!");
		}
		
		else {
			System.out.print("Entered Character is Special Symbol!");
		}
		
	}

}
