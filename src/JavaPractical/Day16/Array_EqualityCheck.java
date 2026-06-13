package JavaPractical.Day16;

import java.util.Scanner;

public class Array_EqualityCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int n= scanner.nextInt();
		
		int[] arr1= new int[n];
		int[] arr2= new int[n];
		
		System.out.println("Enter Array 1 Elements: ");
		for(int i=0; i<n; i++) {
			System.out.print("Element "+(i+1)+" ");
			arr1[i]= scanner.nextInt();
		}
		System.out.println("Enter Array 2 Elements: ");
		for(int i=0; i<n; i++) {
			System.out.print("Element "+(i+1)+" ");
			arr2[i]= scanner.nextInt();
		}
		
		Array_EqualityCheck eq = new Array_EqualityCheck();
//		eq.strictEquality(n, arr1, arr2);
		eq.equality(n, arr1, arr2);
	}
	
	void strictEquality(int n, int[] arr1, int[] arr2) {
		int flag=0;
		for(int i=0; i<n; i++) {
			if(arr1[i]!=arr2[i]) {
				System.out.println("Array Elements are Not Strictly-Equal!");
				flag=1;
				break; 
			}
		}
		if(flag==0) {
			System.out.println("Arrays are Strictly Equal");
		}
	}
	
	void equality(int n, int[] arr1, int[] arr2) {
		int[] flag= new int[n]; 
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(flag[j]==0 && arr1[i]==arr2[j]) {
					flag[j]=1;
					count++;
					break;
				}
			}
		}
		if(count==arr1.length) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are not Equal");
		}
	}

}
