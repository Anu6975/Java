package JavaPractical.Day14;
import java.util.Scanner;

public class Array2d_hollowPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row and column Size: ");
		int r= sc.nextInt();
		int c= sc.nextInt();
		int[][] arr= new int[r][c];
		
		System.out.println("Enter Array Elements: \n");
		for(int i=0; i<r; i++) {
			System.out.println("Row: "+(i+1));
			for(int j=0; j<c; j++) {
				System.out.print(j+1+". ");
				arr[i][j]= sc.nextInt();	
			}
			System.out.println();
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(i==0 || i==r-1 || j==0 || j==c-1) {
					System.out.print(arr[i][j]+"");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
