package Day10;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Scanner;

import JavaPractical.Day3.char_vowel;

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
		
//		Task1.compare(fruit);
		
/*		System.out.println("\n\n-----------1. Printing fruits whose (length > 5)-------------");
		Task1.lengthGreaterFive(fruit);
		
		System.out.println("\n\n-----------2. Printing fruits Starting with Vowels)-------------");
		Task1.checkVowel(fruit);
		
		System.out.println("\n\n-----------3. Printing fruits Count-------------");
		Task1.fruitCount(fruit);

		System.out.println("\n\n-----------4. Searching for a fruit-------------");
		Task1.fruitSearch(fruit);
		
		System.out.println("\n\n-----------5. Remove fruits whose (length < 5)-------------");
		Task1.removeFruit_Length(fruit);
		
		System.out.println("\n\n-----------6. Removing a specific fruit-------------");
		Task1.remove_SpecificFruit(fruit);
		
		System.out.println("\n\n-----------7. Removing fruits that Starts with Vowel-------------");
		Task1.remove_Vowel(fruit); 
		
		System.out.println("\n\n-----------8. Counting Occurrences of Fruits-------------");
		Task1.count_occurrences(fruit); */
		
		
		System.out.println("\n\n-----------9. Printing Duplicate Fruits-------------");
		Task1.duplicate_fruits(fruit); 
		
//		System.out.println("\n\n-----------10. Printing Longest FruitName-------------");
//		Task1.Longest_FruitName(fruit);
		
	}
	
	static void Longest_FruitName(ArrayList<String> fruits) {
		Iterator<String> iterator = fruits.iterator();
		int max=0;
		String maxElement=null;
		while(iterator.hasNext()) {
			String s = iterator.next();
			
			if(s.length()>max) {
				max=s.length();
				maxElement=s;
			}
		}
		
		System.out.println("Longest Element with Length "+max+" is "+maxElement);
	}
	
	static void duplicate_fruits(ArrayList<String> fruits) {
		
		ArrayList<String> seenArrayList = new ArrayList<>();
		ArrayList<String> duplicate = new ArrayList<>();
		
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			
			if(seenArrayList.contains(s)== false) {
				seenArrayList.add(s);
			}
			else if(!duplicate.contains(s)) {
				duplicate.add(s);
			}
		}
		
		System.out.println("Duplicate Elements: "+duplicate);

		/* Printing Removed Duplicate Element */
		System.out.println("Unique Elements: "+seenArrayList);
	}
	
	static void count_occurrences(ArrayList<String> fruits) {
		Iterator<String> it = fruits.iterator();
		
		System.out.print("Enter a Fruit Search Occurrence: ");
		String occur= sc.next();
		int count=0;
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals(occur)) {
				count++;
			}
		}
		
		System.out.println("Occurrence: "+count);
	}
	
	static void remove_Vowel(ArrayList<String> fruits) {
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String s = it.next();
			char vowel_check = s.charAt(0);
			if(vowel_check=='a' || vowel_check=='e' || vowel_check=='i' || vowel_check=='o' || vowel_check=='u' || 
					vowel_check=='A' || vowel_check=='E' || vowel_check=='I' || vowel_check=='O' || vowel_check=='U' ) {
				it.remove();
			}
		}
		
		System.out.println("Updated List: ");
		it=fruits.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
//		System.out.println("\n"+fruits);		//Fruits Array List gets update as well
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
			System.out.println("Fruit Not Found!");
		}
		
	}
	
	static void compare(ArrayList<String> fruits) {
		Iterator<String> it= fruits.iterator(); 			
		
		System.out.println(it.equals(fruits));				//Comparing Iterator and Fruits objects 
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
			it.next();
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
