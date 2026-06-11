package JavaPractical.Day11;

import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element Size: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<n; i++) {
			System.out.print(i+1+". ");
			arr[i]= sc.nextInt();	
		}
		
		int sum=0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: "+sum);

	}

}
