package JavaPractical.Day6;
import java.util.Scanner;

public class Solid_square_patterns {
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
//		pattern7(n);
//		pattern8(n);
//		pattern9(n);
		pattern10(n);
	}
	
	/* Pattern 1 */
	//	1 2 3 
	//	1 2 3 
	//	1 2 3 
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}
	
	
	/* Pattern 2 */
	//	a b c 
	//	a b c 
	//	a b c 
	static void pattern2(int n) {
		
		for(int i=0; i<n; i++) {
			char ch ='a';
			for(int j=0; j<n; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	
	/* PAtter 3 */
//		a b c 
//		d e f 
//		g h i 
	
	static void pattern3(int n) {
		
		char ch ='a';
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	
	/* PAttern 4 */
//		@ @ @ 
//		# # # 
//		@ @ @ 
	static void pattern4(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i%2 == 0)
					System.out.print("@ ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}	
	}
	
	/* Pattern 5 */
//		@ # @
//		@ # @
//		@ # @
	static void pattern5(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j%2 == 0)
					System.out.print("@ ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}	
	}
	
	/* Pattern 6 */
//		1 2 3 
//		4 5 6 
//		7 8 9
		
	static void pattern6(int n) {
		int num=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", num);
				num++;
			}
			System.out.println();
		}
	}
	
	/* Pattern 7 */
//		1 1 1 
//		2 2 2 
//		3 3 3 

	static void pattern7(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", i+1);
			}
			System.out.println();
		}
	}
	
	/* Pattern 8 */
	
//		a a a 
//		b b b 
//		c c c 
	static void pattern8(int n) {
		char ch ='a';
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
	
	/*PAttern 9*/
//		1 2 3 
//		2 3 4 
//		3 4 5 
	
	static void pattern9(int n) {
		for(int i=1; i<=n;i++) {
			int temp=i;
			for(int j=0; j<n; j++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
	
	/*PAttern 10*/
//		a b c 
//		b c d 
//		c d e 
	static void pattern10(int n) {
		char temp= 'a';
		for(int i=1; i<=n;i++) {
			for(int j=0; j<n; j++) {
				System.out.print(temp+" ");
				temp++;
			}
			temp-=2;
			System.out.println();
		}
	}

}
