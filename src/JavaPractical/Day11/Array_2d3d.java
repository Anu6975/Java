package JavaPractical.Day11;

import java.util.Scanner;

public class Array_2d3d {
	Scanner sc = new Scanner(System.in);
	public static void main(String [] arg) {
		Array_2d3d a= new Array_2d3d();
		a.array_2d();
		a.array_3d();
		
	}
	
	void array_2d(){
		System.out.print("Enter row and column Size: ");
		int r= sc.nextInt();
		int c= sc.nextInt();
		int[][] arr= new int[r][c];
		
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(j+1+". ");
				arr[i][j]= sc.nextInt();	
			}
			System.out.println();
			System.out.println("Row: "+2);
		}
		
		//Printing 2d Array
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	void array_3d() {
		System.out.print("Enter row, column, and  Size: ");
		int r= sc.nextInt();
		int c= sc.nextInt();
		int z= sc.nextInt();
		int[][][] arr= new int[r][c][z];
		
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				for(int k=0; k<z;k++) {
					System.out.print(j+1+". ");
					arr[i][j][k]= sc.nextInt();
				}
			}
			System.out.println();
			System.out.println("Row: "+2);
		}
		
		//Printing 3d Array
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				for(int k=0; k<z; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
