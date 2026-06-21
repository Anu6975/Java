package JavaPractical.Day19;

import java.util.Scanner;

import JavaPractical.Day3.char_vowel;

public class String_Without_IndexOf {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.nextLine().toLowerCase();
		
		System.out.println("Enter character to Find Index: ");
		char index = sc.next().charAt(0);
		
		char [] array = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			if(array[i]==index) {
				System.out.println("Index: " + i);
			}
		}
	}

}
