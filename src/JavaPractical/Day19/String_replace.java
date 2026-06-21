package JavaPractical.Day19;

import java.util.Scanner;

public class String_replace {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String_replace sr= new String_replace();
		
		System.out.print("Enter String: ");
		String str= sc.nextLine().toLowerCase();
		
		System.out.print("Enter Character to Replace: ");
		char ch = sc.next().charAt(0);
		
		sr.replace_specific_character(str, ch);
		sr.replace_everyChar(str, ch);
	}
	
	void replace_specific_character(String str, char ch) {
		char[] chars = str.toCharArray();
		
		System.out.print("Enter Index: ");
		int index= sc.nextInt();
		
		chars[index] =ch; 
		String replacedString=new String(chars);
		System.out.println("Replaced String: "+replacedString);	
	}
	
	void replace_everyChar(String str, char ch) {
		System.out.print("Enter Character from String to Replace with: ");
		char user_char = sc.next().charAt(0);
		System.out.println("Replaced String: "+ str.replace(user_char, ch));
	}
}
