package JavaPractical.Day11;
import java.util.Scanner;

public class Array_Reverse {
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
		
		int [] reversed_arr=new int[n];
		for(int i=arr.length-1; i>=0; i--) {
			reversed_arr[n-1-i]= arr[i];
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(reversed_arr[i]+", ");	
		}
	}

}
