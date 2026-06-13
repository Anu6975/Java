package JavaPractical.Day16;

import java.util.Scanner;

public class Array_PresentCheck {

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
		
		System.out.println("Enter Element to Check: ");
		int element = sc.nextInt();
		int flag=0;
		for(int i=0; i<n; i++) {
			if(element==arr[i]) {
				System.out.println("Element is Present in the Array, at Index "+i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element is not Present in the Array!");
		}

	}

}
