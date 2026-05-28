package JavaPractical.DSA.Sorting;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Element Size: ");
		int n= sc.nextInt();
		int[] arr=new int[n];
		
		System.out.print("Enter "+n+ " Array Elements: ");
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("Original Array: ");
		printArray(n, arr);
		
		System.out.print("\nSorted Array  : ");
		selection_sort(n, arr);
	}	
	
	static void selection_sort(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int minIndex=i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			int temp=arr[minIndex];
			arr[minIndex]= arr[i];
			arr[i]= temp;
		}
		printArray(n, arr);
	}
	
	static void printArray(int n, int[] arr) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}

/**
 * SELECTION SORT ALGORITHM
 *
 * 1. Find the minimum element in the unsorted subarray.
 * 2. Swap it with the first unsorted element.
 * 3. Move the boundary between sorted and unsorted subarrays one element to the right.
 * 4. Repeat until the array is fully sorted.
 */

