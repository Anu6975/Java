package JavaPractical.JavaPractice;
import java.net.http.WebSocket.Listener;
import java.util.Scanner;

import JavaPractical.Day3.char_vowel;

public class C1_String_Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str = sc.nextLine();
		
		System.out.println("Enter String 2: ");
		String str1 = sc.nextLine();
		int n, s;
		if(str.length()>str1.length()) {
			n=str.length();
			s=str1.length();
		}
		else {
			n=str1.length();
			s=str.length();
		}
		
		char[] counted = new char[n];
		int count=0;											// Listen , Silent
		for(int i=0; i<n; i++) {
			for(int j=0; j<s; j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					counted[i]=str.charAt(i);
				}
			}
		}
		if(counted.length==n)
			System.out.println("Anagram");
		else
			System.out.println("No Anagram");
	}
}
