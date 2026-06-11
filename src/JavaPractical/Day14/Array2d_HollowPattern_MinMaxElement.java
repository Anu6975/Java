package JavaPractical.Day14;
import java.util.*;

public class Array2d_HollowPattern_MinMaxElement {

	public static void main(String[] args) {
		Array2d_HollowPattern_MinMaxElement a1 = new Array2d_HollowPattern_MinMaxElement();
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
		
		System.out.println("*=========* Hollow Pattern *=========* ");
		a1.hollowPattern_Print(arr, r,c);
		
		System.out.println("\n *-----* Minimum Outer Element *-----* ");
		a1.outer_MinimumElement(arr, r, c);
		
		System.out.println("\n *------* Maximum Outer Element *------* ");
		a1.outer_MaximumElement(arr, r, c);
		
		System.out.println("\n*=========* Hollow Pattern- Inner Elements *=========* ");
		a1.hollowPattern_InnerElements(arr, r, c);
		
		System.out.println("\n*------* Minimum Inner Element *-----* ");
		a1.inner_MinimumElement(arr, r, c);
		
		System.out.println("\n*-----* Maximum Inner Element *-----* ");
		a1.inner_MaximumElement(arr, r, c);
		
		
	}
	
	void hollowPattern_Print(int arr[][], int r, int c) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(i==0 || i==r-1 || j==0 || j==c-1) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	void hollowPattern_InnerElements(int arr[][], int r, int c) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(i==0 || i==r-1 || j==0 || j==c-1) {
					System.out.print(" ");
				}
				else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	void outer_MinimumElement(int arr[][], int r, int c) {
		int min=arr[0][0];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(i==0 || i==r-1 || j==0 || j==c-1) {
					if(min>arr[i][j]) {
						min=arr[i][j];
					}
				}
			}
		}
		System.out.println("Minimun Element in Outer Elements is: "+min);
	}
	
	void outer_MaximumElement(int arr[][], int r, int c) {
		int max=arr[0][0];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(i==0 || i==r-1 || j==0 || j==c-1) {
					if(max<arr[i][j]) {
						max=arr[i][j];
					}
				}
			}
		}
		System.out.println("Minimun Element in Outer Elements is: "+max);
	}
	
	void inner_MinimumElement(int arr[][], int r, int c) {
		int minimum=arr[1][1];
		for(int i=1; i<r-1; i++) {
			for(int j=1; j<c-1; j++) {
//				if(i!=0 || i!=r-1 || j!=0 || j!=c-1) {
					if(minimum>arr[i][j]) {
						minimum=arr[i][j];
					}
//				}
			}
		}
		System.out.println("Minimun Element in Inner Elements is: "+minimum);
	}
	
	void inner_MaximumElement(int arr[][], int r, int c) {
		int maximum=arr[1][1];
		for(int i=1; i<r-1; i++) {
			for(int j=1; j<c-1; j++) {
//				if(i!=0 || i!=r-1 || j!=0 || j!=c-1) {
					if(maximum<arr[i][j]) {
						maximum=arr[i][j];
					}
//				}
			}
		}
		System.out.println("Minimun Element in Inner Elements is: "+maximum);
	}
}
