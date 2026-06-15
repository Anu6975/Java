//Take Flowers Input From User and Perform Manipulation Tasks on it


package Day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Flower Numbers: ");
		int n = sc.nextInt();
		
		ArrayList<String> flower = new ArrayList<>();
		
		System.out.println("Enter Flowers: ");
		for(int i=0; i<n; i++) {
			System.out.print("Flower "+(i+1) +": ");
			flower.add(sc.next());
		}

		System.out.println();
		System.out.println("** Entered Flowers: **");
		for(String f: flower) {
			System.out.println(f);
		}
		
		System.out.println("\n------Check Index of Specific Flower------");
		
		System.out.println("Enter Flower to Check index: ");
		String fl = sc.next();
		Iterator<String> it = flower.iterator();
		while (it.hasNext()) {
			if(it.next().equals(fl)) {
				System.out.print("Index of "+fl+" is: "+flower.indexOf(fl));
			}
		}
		
		
		System.out.println("\n------Check Flower Name on Specific Index------");
		
		System.out.println("Enter Index to Check flower: ");
		int index= sc.nextInt();
		System.out.println("Flower on Index "+index+ " is: "+flower.get(index));
		
		
		System.out.println("\n------Remove Specific Flower with Index------");
		
		System.out.println("Enter Index to Remove flower: ");
		int index1= sc.nextInt();
		flower.remove(index1);
		System.out.print("flower has been Removed Successfully!\nUpdated Flower List: " + flower);
		
	}
}
