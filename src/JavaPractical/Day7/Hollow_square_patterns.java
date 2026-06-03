package JavaPractical.Day7;
import java.util.Scanner;

import JavaPractical.Day3.char_vowel;

public class Hollow_square_patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Square Length: ");
		int n=sc.nextInt();
		
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
//		pattern6(n);
		pattern7(n);
		
	}

//	@ $ @ $ @ 
//	@       @ 
//	@       @ 
//	@       @ 
//	@ $ @ $ @ 
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0|| j==n-1|| i==n-1) {
					if(j%2==0)
						System.out.print("@ ");
					else 
						System.out.print("$ ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
//	
//	@ @ @ @ @ 
//	$       $ 
//	@       @ 
//	$       $ 
//	@ @ @ @ @ 
	static void pattern2(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0|| i==n-1|| j==0|| j==n-1) {
					if(i%2==0)
						System.out.print("@ ");
					else 
						System.out.print("$ ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
	
//	1 0 1 0 1 
//	1       1 
//	1       1 
//	1       1 
//	1 0 1 0 1 
	static void pattern3(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0|| j==n-1|| i==n-1) {
					if(j%2==0)
						System.out.print("1 ");
					else 
						System.out.print("0 ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
//	1 1 1 1 1 
//	1       1 
//	1       1 
//	1       1 
//	1 1 1 1 1 
	static void pattern4(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0|| j==n-1|| i==n-1) {
					System.out.print("1 ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
//	1 2 3 4 5 
//	6          10 
//	11          15 
//	16          20 
//	21 22 23 24 25 
	static void pattern5(int n) {
		int temp=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0|| j==n-1|| i==n-1) {
					System.out.print(temp+" ");
					temp++;
				}
				else {
					System.out.print("   ");
					temp++;
				}
			}
			System.out.println();
		}
	}
	
//	a a a a a 
//	b       b 
//	c       c 
//	d       d 
//	e e e e e 
	static void pattern7(int n) {
		char ch = 'a';
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0|| j==n-1|| i==n-1)
					System.out.print(ch+" ");
				else
					System.out.print("  ");
			}
			ch++;
			System.out.println();
		}
}
	
//	1 2 3 4 5 
//	1       5 
//	1       5 
//	1       5 
//	1 2 3 4 5 
	static void pattern6(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0|| j==n-1|| i==n-1)
					System.out.print((j+1)+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
	
	
	