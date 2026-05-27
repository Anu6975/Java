package JavaPractical.Day3;

import java.util.Scanner;

public class char_vowel {
	public static void main(String[] a) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter a Letter: ");
		char l = s.next().charAt(0);
		
		if(l=='a' || l=='e' || l=='e' || l=='e' || l=='e' || 
		   l=='A' || l=='E' || l=='I' || l=='O' || l=='U') {
			
			System.out.println("Letter is Vowel!");
		}
		
		else {
			System.out.println("Letter is not vowel");
		}
		
		
	}
}
