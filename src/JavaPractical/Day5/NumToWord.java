package JavaPractical.Day5;
import java.util.*;

public class NumToWord {

		public static void main (String[] g) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ente a Number(1-10): ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("Number is One");
				break;
			case 2:
				System.out.println("Number is Two");
				break;
			case 3:
				System.out.println("Number is Three");
				break;
			case 4:
				System.out.println("Number is Four");
				break;
			case 5:
				System.out.println("Number is Five");
				break;
				
			case 6:
				System.out.println("Number is Six");
				break;
				
			case 7:
				System.out.println("Number is Seven");
				break;
				
			case 8:
				System.out.println("Number is Eight");
				break;
				
			case 9:
				System.out.println("Number is Nine");
				break;
				
			case 10:
				System.out.println("Number is Ten");				
				break;
				
			case 0:
				System.out.println("Number is Zero");
				break;
				
			default:
				if(num<0) {
				System.out.println("Number is Negative!");
				}
				else
					System.out.println("Number is Not between 1-10");
				
			}
}
}