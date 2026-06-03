package JavaPractical.Day5;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Alphabet: ");
		char ch= sc.next().charAt(0);
		
		switch (ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Entered Alphabet is Vowel");
			break;
			
		default:
			System.out.println("Entered Alphabet is not Vowel");
		}
		
		
	}
}
