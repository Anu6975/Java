package Day10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



public class Task1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Number of Fruits: ");
		int n = sc.nextInt();
		
		ArrayList <String> fruit = new ArrayList<>();
		
		System.out.println("Enter Fruits: ");
		for(int i=0; i<n; i++) {
			System.out.print("Fruit "+(i+1)+": ");
			fruit.add(sc.next());
		}
		
		Iterator<String> it = fruit.iterator();
		System.out.print("Entered Fruits: ");
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
/*		System.out.println("\n\n-----------1. Printing fruits whose (length > 5)-------------");
		Task1.lengthGreaterFive(fruit);
		
		System.out.println("\n\n-----------2. Printing fruits Starting with Vowels)-------------");
		Task1.checkVowel(fruit);
		
		System.out.println("\n\n-----------3. Printing fruits Count-------------");
		Task1.fruitCount(fruit);

		System.out.println("\n\n-----------4. Searching for a fruit-------------");
		Task1.fruitSearch(fruit);
		
		System.out.println("\n\n-----------5. Remove fruits whose (length < 5)-------------");
		Task1.removeFruit_Length(fruit);*/
		
		System.out.println("\n\n-----------6. Removing a specific fruit-------------");
		Task1.remove_SpecificFruit(fruit);


	}
	
	static void remove_SpecificFruit(ArrayList<String> fruits) {
		System.out.print("Enter a Fruit to remove: ");
		String remove_fruit = sc.next();
		
		int flag=0;
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			String str = it.next();
			if(str.equalsIgnoreCase(remove_fruit)) {
				it.remove();
				flag=1;
				System.out.println("Fruit Removed!!");
				break;
			}
		}
		
		System.out.println("Updated List: ");
		it=fruits.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		if(flag==0) {
			System.out.println("Invalid Input!");
		}
		
	}
	
	static void removeFruit_Length(ArrayList<String> fruits) {
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.length()<5) {
				it.remove();
			}
		}
		it= fruits.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
	}
	
	static void fruitSearch(ArrayList<String> fruits) {
		Iterator<String> it = fruits.iterator();
		System.out.print("Enter Fruit to Search: ");
		String search_fruit= sc.next();
		int flag=0;
		while (it.hasNext()) {
			String s = it.next();
			if(search_fruit.equalsIgnoreCase(s)) {
				System.out.println("Fruit Found!");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Fruit Not Found!");
		}
	}
	
	static void fruitCount(ArrayList<String> fruits) {
		Iterator<String> it = fruits.iterator();
		int count=0;
		while (it.hasNext()) {
			count++;
		}
		System.out.println(count);
	}
	
	static void checkVowel(ArrayList<String> fruits) {
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String s= it.next();
			char vowel_check = s.charAt(0);
			if(vowel_check=='a' || vowel_check=='e' || vowel_check=='i' || vowel_check=='o' || vowel_check=='u' || 
			   vowel_check=='A' || vowel_check=='E' || vowel_check=='I' || vowel_check=='O' || vowel_check=='U') {
				System.out.print(s+" ");
			}
		}
	}
	
	static void lengthGreaterFive(ArrayList<String> fruits) {
//		for(String s: fruits) {
//			if(s.length() > 5) {
//				System.out.print(s+" ");
//			}
//		}
		
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if(s.length()>5) {
				System.out.print(s+" ");
			}
			
		}
	}

}
