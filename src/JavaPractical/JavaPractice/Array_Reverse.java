import java.util.*;

class Array_Reverse{
	public static void main(String [] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Element Size: ");
		int n= sc.nextInt();

		System.out.print("Enter Array Elements: ");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Element "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Reversed Array:");
		for(int i=n-1; i>=0; i--){
			System.out.print(" "+arr[i]);
		}
	}
}