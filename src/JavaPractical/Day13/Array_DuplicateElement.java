package JavaPractical.Day13;

import java.util.Scanner;

public class Array_DuplicateElement {
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
		
//		System.out.print("Enter Element to Find: ");
//		int s= sc.nextInt();

		int count=0;
		int[] arr2= new int[n];
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					arr2[i]=arr[j];
					count++;
				}
			}
		}
		if(count==0) {
			System.out.println("No Duplicate Elemente");
		}
		else {
			System.out.println("Duplicate Elements: ");
			for(int i=0; i<n; i++) {
				if(arr2[i]!=0)
					System.out.print(arr2[i]+" ");
			
			}
			System.out.println("\nTotal Duplicate Elements: "+count);
		}
	}
}
