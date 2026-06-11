package JavaPractical.Day12;

import java.util.Scanner;

public class Array_contains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Element Size: ");
		int n= sc.nextInt();
		String[] arr= new String[n];
		System.out.println("Enter Array Elements: \n");
		for(int i=0; i<n; i++) {
			System.out.print("Element "+(i)+". ");
			arr[i]= sc.next();	
		}
		
		System.out.print("Enter Element to Find: ");
		String s= sc.next();

		int flag=0;
		for(int i=0; i<n; i++) {
			if(s.equalsIgnoreCase(arr[i])) {
				System.out.println(i+" Index contains "+s);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element is not in Present!");
		}

	}

}
