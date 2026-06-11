package JavaPractical.Day12;

import java.util.Scanner;

public class Array_ElementSearch {

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
		
		System.out.print("Enter Element to Find: ");
		int s= sc.nextInt();

		int flag=0;
		for(int i=0; i<n; i++) {
			if(s==arr[i]) {
				System.out.println(s+" is at Index "+i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element is not in Present!");
		}
	}

}
