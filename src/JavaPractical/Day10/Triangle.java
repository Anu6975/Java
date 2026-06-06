package JavaPractical.Day10;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int n=sc.nextInt();
		
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
		pattern6(n);
	}
	
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
				}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	* * * * 
//	 * * * 
//	  * * 
//	   * 
	static void pattern2(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int k=n; k>i; k--) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
//	   * 
//	  * * 
//	 * * * 
//	* * * * 
//	 * * * 
//	  * * 
//	   * 
	static void pattern3(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
				}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int k=n; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
//	    1 
//	   2 2 
//	  3 3 3 
//	 4 4 4 4 
//	 4 4 4 4 
//	  3 3 3 
//	   2 2 
//	    1 
	static void pattern4(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
				}
			for(int k=0; k<=i; k++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}

		int num=n;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int k=n; k>i; k--) {
				System.out.print(num+" ");	
			}
			num--;
			System.out.println();
		}	
	}
	
//	   * 
//	  * * 
//	 * * * 
//	* * * * 
//	 * * * 
//	  * * 
//	   * 
	static void pattern5(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
				}
			for(int k=0; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int k=n; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
//	   1 
//	   2 2 
//	  3 3 3 
//	 4 4 4 4 
//	  3 3 3 
//	   2 2 
//	    1 
	static void pattern6(int n) {
		int num=0;
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
				}
			for(int k=0; k<i; k++) {
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int k=n; k>i; k--) {
				System.out.print(num+" ");
			}
			num--;
			System.out.println();
		}	
	}
}
