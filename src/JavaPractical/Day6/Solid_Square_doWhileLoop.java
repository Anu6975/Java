package JavaPractical.Day6;
import java.util.Scanner;
public class Solid_Square_doWhileLoop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Square Length: ");
		int n=sc.nextInt();
		int i=0;
		
		do {
			int j=0;
			do {
				System.out.print("# ");
				j++;
			}while(j<n-1);
			
			
			System.out.println();	
			i++;	
		}while(i<n-1);
			
	}
}
