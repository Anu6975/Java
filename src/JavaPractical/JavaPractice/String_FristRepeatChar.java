package JavaPractical.JavaPractice;

import java.util.Scanner;

public class String_FristRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine().toLowerCase();
		
		int n=str.length();
		boolean found=false;

		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("First Repeated char: "+ str.charAt(i));
					found = true;
					return;
				}
			}
		}
		if(!found)
			System.out.println("No Repeated Character");
	}

}
