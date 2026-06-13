package JavaPractical.Day15;

import java.util.Scanner;

public class Array_leftRotation {

	public static void main(String[] args) {
		//5 09 left rotation
		//6 10 right rotation
		//8 14 transpose of array
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element Size: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter Array Elements: \n");
		for(int i=0; i<n; i++) {
			System.out.print("Element "+(i+1)+". ");
			arr[i]= sc.nextInt();	
		}
	}

}
