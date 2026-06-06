package JavaPractical.Day9;
import java.util.Scanner;

public class RightAngled_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int n=sc.nextInt();
		
		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
//		pattern1(n);

	}

//		  * 
//		* * 
//	  * * * 
//	* * * *
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	* * * * 
//	  * * * 
//	    * * 
//	      * 
	static void pattern2(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int k=n; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	0 1 0 1 0 
//	  0 1 0 1 
//	    0 1 0 
//	      0 1 
//	        0 
	static void pattern3(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int k=n; k>i; k--) {
				if((n-k)%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
	

	static void pattern4(int n) {
	
}

	static void pattern5(int n) {
	
}

}
