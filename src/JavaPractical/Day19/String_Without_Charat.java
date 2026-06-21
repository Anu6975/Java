package JavaPractical.Day19;

import java.util.Scanner;

public class String_Without_Charat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter Index to Find Character: ");
		int index = sc.nextInt();
		
		char [] array = str.toCharArray();
		int flag=0;
		
		if( index<str.length()) {
		for(int i=0; i<str.length(); i++) {
			if(i==index) {
				System.out.println("Character at " + array[i]);
				flag=1;
			}
		}
		}
		else {
			System.out.println("Index out of Bounds");
		}
		
		if(flag==0) {
			System.out.println("Invalid Index!!");
		}

	}

}
