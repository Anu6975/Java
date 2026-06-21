package JavaPractical.Day19;
import java.util.Scanner;

public class String_charRepeat {
	static Scanner sc = new Scanner(System.in);
	public static void main(String a[]) {
		String_charRepeat cr = new String_charRepeat();
		
		
		System.out.print("Enter String: ");
		String str= sc.nextLine();
		
//		cr.Specific_repeat(str);
		cr.index_repeatation(str);
	}
	
	void Specific_repeat(String str) {
		
		System.out.print("Enter repeatation count: ");
		int n= sc.nextInt();

		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<n; j++) {
				System.out.print(str.charAt(i));
			}
		}
	}
	
	void index_repeatation(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(str.charAt(i));
			}	
		}
	}
}
