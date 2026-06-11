package JavaPractical.Day13;

import java.util.Scanner;

public class Array_EvenOddElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element Size: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter Array Elements: \n");
		for(int i=0; i<n; i++) {
			System.out.print("Element "+(i+1)+". ");
			arr[i]= sc.nextInt();	
		}
		int[] even=new int[n];
		int[] odd=new int[n];
		
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
				even[i]=arr[i];	
			}
			else {
				odd[i]=arr[i];
			}
		}

		System.out.print("Even Numbers: \n[ ");
		for(int i=0; i<n; i++) {
			if(even[i]!=0)
			System.out.print(even[i]+" ");	
		}
		System.out.print("] ");
		
		System.out.print("\nOdd Numbers: \n[ ");
		for(int i=0; i<n; i++) {
			if(odd[i]!=0)
			System.out.print(odd[i]+" ");	
		}
		System.out.print("] ");
	}
	

}
