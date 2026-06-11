package JavaPractical.Day12;

import java.util.Scanner;

public class Array_Indexof {

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
		
		System.out.println("Enter Element Index: ");
		int index=sc.nextInt();
		
		int flag=1;
		for(int i=0; i<n; i++) {
			if(index==i){
				System.out.println("Element at "+index+" is "+arr[i]);
				flag=1;
				break;
			}
		}

		if(flag==0) {
			System.out.println("Invalid Input!Not in Array");
		}
	}

}
