package JavaPractical.Day5;

import java.util.Scanner;

public class switch_MenuCard {

	public static void main (String[] g) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose From Menu: \n1. Pizza 2. Burger 3. Sandwich 4. Tortila 5. Taco\nEnter Your Choice: ");
		String menu = sc.next().toLowerCase();
		
		switch(menu) {
		case "pizza":
			System.out.println("Pizza Ordered! Please wait while we prepare your food..");
			break;
		case "burger":
			System.out.println("Burger Ordered! Please wait while we prepare your food..");
			break;
		case "sandwich":
			System.out.println("Sandwich Ordered! Please wait while we prepare your food..");
			break;
		case "tortila":
			System.out.println("Tortila Ordered! Please wait while we prepare your food..");
			break;
		case "taco":
			System.out.println("Taco Ordered! Please wait while we prepare your food..");
			break;
			
		default:
			System.out.println("Invalid Input!!");
			
		}
	}
}
