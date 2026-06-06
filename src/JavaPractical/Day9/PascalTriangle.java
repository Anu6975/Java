package JavaPractical.Day9;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int n=sc.nextInt();
		
		rightPascal_Triangle(n);
//		leftPascal_Triangle(n);

	}
	
//    	* 
//    * * 
//	* * * 
//	* * * 
//    * * 
//    	* 
	static void rightPascal_Triangle(int n){
		//RightAngled Triangle
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//Inverted RightAngled Triangle
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			for(int k=n; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	* 
//	* * 
//	* * * 
//	* * * 
//	* * 
//	* 
	static void leftPascal_Triangle(int n){
		//LeftAngled Triangle
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//Inverted LeftAngled Triangle
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
