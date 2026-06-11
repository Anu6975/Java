package JavaPractical.Day14;

import java.util.Scanner;

public class Array_RemoveDuplicates {

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

		int[] removed = new int[n];
		for(int i=0; i<n; i++) {
			int count=0;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0) {
				removed[i]=arr[i];
			}
		}
		System.out.println("Duplicate Elements Removed: \n[");
		for(int i=0; i<n; i++) {
			if(removed[i]!=0)
			System.out.print(removed[i]+" ");	
		}
		System.out.println("]");
		
	}

}
