package JavaPractical.Day17;

import java.util.Scanner;

public class Array_2ndLargest {

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
		
		int largest= Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(largest<arr[i]) {
				secondLargest=largest;
				largest=arr[i];
			}
			
			else if(arr[i] != largest && arr[i] > secondLargest)
				secondLargest=arr[i];
		}

		System.out.println("2nd Largest is : "+secondLargest);
	}

}
