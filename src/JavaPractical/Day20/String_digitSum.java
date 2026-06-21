package JavaPractical.Day20;
import java.util.*;

public class String_digitSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = sc.next();
		int sum=0, flag=0;
		
		for(int i=0; i<string.length(); i++) {
			if(Character.isDigit(string.charAt(i))){
				sum=sum + (string.charAt(i) - '0');
				flag=1;
			}
		}

		if(flag==1) {
			System.out.println("Sum: "+sum);
		}
		else {
			System.out.println("No Numeric Value in String!");
		}
		sc.close();
	}

}
