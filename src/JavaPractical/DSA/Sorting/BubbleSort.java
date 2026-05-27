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
