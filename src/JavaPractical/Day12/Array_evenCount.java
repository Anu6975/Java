//check even number is present in array
// print even numbers in the array
// count even numbers present in array
//Sum of even numbers in array

package JavaPractical.Day12;

public class Array_evenCount {

	public static void main(String[] args) {
		int[] arr= {66, 34, 82, 91, 70};
		int count=0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				count++;
				System.out.print(arr[i]+" ");
				sum+=arr[i];
			}
		}
		System.out.println("\nEven Element Count: "+count+"\nSum is "+sum);

	}

}
