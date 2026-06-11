package JavaPractical.Day11;

import java.util.Scanner;

public class Array_LargestElement {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element Size: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<n; i++) {
			System.out.print(i+1+". ");
			arr[i]= sc.nextInt();	
		}
		int largest=arr[0];
		for(int i=0; i<n;i++) {
			for(int j=1; j<n; j++) {
				if(largest<arr[j]) {
					largest=arr[i];
				}
			}
		}
		System.out.println("Largest Element: "+largest);
	}

}
