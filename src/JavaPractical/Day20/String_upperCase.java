package JavaPractical.Day20;
import java.util.Scanner;

public class String_upperCase {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String string = sc.nextLine().toLowerCase();
		
		System.out.println("Using tpUpperCase- in built Function: "+ string.toUpperCase());
		String str = "";
		
		for(int i=0; i<string.length(); i++) {
			char ch=string.charAt(i);
			
			if(ch  >= 'a' &&  ch<='z')
				str = str + (char) (ch - ' ');
			else
				str = str + ch;
		}
		System.out.println("\nWithout Using Built-in function:      "+ str);
	}

}
