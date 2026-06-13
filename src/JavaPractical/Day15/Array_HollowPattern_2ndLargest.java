package JavaPractical.Day15;

import java.util.Scanner;

public class Array_HollowPattern_2ndLargest {

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
		Array_HollowPattern_2ndLargest hl = new Array_HollowPattern_2ndLargest();
//		hl.outer_2ndLargest(r, c, arr);
		hl.inner_2ndLargest(r, c, arr);
	}
	
	
	void outer_2ndLargest(int r, int c, int[][] arr) {

		int largest= Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;
		
		System.out.println("\nHollow Pattern: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if( i==0|| i==r-1|| j==0 || j==c-1) {
					System.out.print(arr[i][j]+"  ");
					if(arr[i][j]>largest) {
						secondLargest=largest;
						largest=arr[i][j];	
					}
					else if(arr[i][j] != largest && arr[i][j]>secondLargest)
						secondLargest=arr[i][j];
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("\nOuter 2nd Largest is : "+secondLargest);
	}
	
	void inner_2ndLargest(int r, int c, int[][] arr) {

		int largest= Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;
		
		System.out.println("\nHollow Pattern: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if( i==0|| i==r-1|| j==0 || j==c-1) {
					System.out.print(arr[i][j]+"  ");
				}
				else {
					System.out.print("   ");
					
					if(arr[i][j]>largest) {
						secondLargest=largest;
						largest=arr[i][j];	
					}
					else if(arr[i][j] != largest && arr[i][j]>secondLargest)
						secondLargest=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("\nInner 2nd Largest is : "+secondLargest);
	}

}
