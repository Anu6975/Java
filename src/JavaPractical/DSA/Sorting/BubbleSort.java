package JavaPractical.DSA.Sorting;
import java.util.Scanner;

public class BubbleSort {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] a){
        System.out.print("Enter No. of Elements: ");
        int n=sc.nextInt();

        int[] arr= new int[n+1];

        for(int i=0; i<n; i++){
            System.out.printf("Enter Elements %d: ", i+1);
            arr[i]=sc.nextInt();
        }
        
        bubble_sort(arr, n);
    }

    static void bubble_sort( int arr[], int n){

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;}
            }
        }
        System.out.print("Sorted Elements:");
        for(int i=0; i<n; i++){
            System.out.print(" "+ arr[i]);
        }
    }
}



/**
 * BUBBLE SORT ALGORITHM
 * 
 * 1. Begin
 * 2. Get the array and its length (N).
 * 3. Loop through the array from index i = 0 to N-1 (Passes):
 *    a. Set a 'swapped' flag to false.
 *    b. Loop through unsorted elements from index j = 0 to N-i-1:
 *       - Compare adjacent elements: arr[j] and arr[j+1].
 *       - If arr[j] > arr[j+1], swap them and set 'swapped' to true.
 *    c. If 'swapped' remains false, break early (array is sorted).
 * 4. Repeat until the largest elements bubble to the end.
 * 5. Exit
 */
