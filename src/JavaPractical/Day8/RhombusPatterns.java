package JavaPractical.Day8;
import java.util.Scanner;

public class RhombusPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length: ");
		int n=sc.nextInt();
		
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
		pattern6(n);
	}
	
	
	
	
	
//	1 1 1 1 
//	 1 1 1 1 
//	  1 1 1 1 
//	   1 1 1 1 
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<n; k++) {
				System.out.print("1 ");	
			}
			System.out.println();
		}
	}
	
//    1 1 1 1 
//   1 1 1 1 
//  1 1 1 1 
// 1 1 1 1 
	static void pattern2(int n){
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<n; k++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
	
//    A 2 C 4 
//   A 2 C 4 
//  A 2 C 4 
// A 2 C 4 
	static void pattern3(int n) {
		for(int i=0; i<n; i++) {
			char ch= 'A'; 
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<n; k++) {
				if (k%2==0) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print((k+1)+" ");
				}
				ch++;
			}
			System.out.println();
		}
	}
	
//	A 2 C 4 
//	 A 2 C 4 
//	  A 2 C 4 
//	   A 2 C 4 
	static void pattern4(int n) {
		for(int i=0; i<n; i++) {
			char ch= 'A'; 
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<n; k++) {
				if (k%2==0) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print((k+1)+" ");
				}
				ch++;
			}
			System.out.println();
		}
	}
	
//	    * * * * 
//	   *     * 
//	  *     * 
//	 * * * * 
	static void pattern5(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<n; k++) {
				if(i==0 || i==n-1|| k==0|| k==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
//	* * * * 
//	 *     * 
//	  *     * 
//	   * * * * 
	static void pattern6(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<n; k++) {
				if(i==0 || i==n-1|| k==0|| k==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
