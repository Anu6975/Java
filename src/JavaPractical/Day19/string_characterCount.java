package JavaPractical.Day19;
import java.util.Scanner;

public class string_characterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str= sc.nextLine().toLowerCase();
		System.out.print("Enter Character to Count: ");
		char ch = sc.next().charAt(0);
		
		int count=0, flag=0;
		for(int i=0; i<str.length(); i++) {
			if(ch==str.charAt(i)) {
				count++;
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("Occurence of '"+ch+"' in String: "+count);
		else
			System.out.println("Character Not found!");
	}

}
