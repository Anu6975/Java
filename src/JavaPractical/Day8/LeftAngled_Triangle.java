package JavaPractical.Day8;

import java.util.Scanner;

public class LeftAngled_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int n=sc.nextInt();
		
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
		pattern4(n);
	}
	
//	* 
//	* * 
//	* * * 
//	* * * * 
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
	static void pattern2(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
	
//	* * * * 
//	* * * 
//	* * 
//	* 
	static void pattern3(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	0 1 2 3 
//	4 5 6 
//	7 8 
//	9 
	static void pattern4(int n) {
		int num=0;
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
	}
}
