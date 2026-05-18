/* Fibonacci Series */

package Day4;
import java.util.Scanner;


public class Task1 {
	public static void main(String[] args) {
		int n, n1=0, n2=1, n3;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Fibinacci Serie Limit: ");
		n=s.nextInt();
		
		System.out.print(n1+" "+n2);
		for(int i=2; i<n; i++) {
			n3 = n1+n2;
			System.out.print(" "+ n3);
			
			n1=n2;
			n2=n3;
		}
	}

}
