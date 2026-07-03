// List of Even_Odd Numbers Using ArrayList and Iterator

package JavaPractical.JavaPractice;
import java.util.*;

class ArrayList_EvenOdd{
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Element Size: ");
		int n= sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd= new ArrayList<>();
		System.out.println("Enter "+n+ " Array Elements: ");
		for(int i=0; i<n; i++){
			System.out.print("Element "+(i+1)+": ");
			arr.add(sc.nextInt());
		}
		int even_count=0, odd_count=0;
		for(int i=0; i<n; i++){
			if(arr.get(i) %2==0){
				even.add(arr.get(i));
				even_count++;
			}
			else{
				odd.add(arr.get(i));
				odd_count++;
			}
		}
		System.out.print("\n\nEven Count: "+ even_count+"\nEven Elements: "+even);
		System.out.print("\n\nOdd Count: "+ odd_count +"\nOdd Elements: "+odd);
	}
}
