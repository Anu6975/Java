// String Duplicates Present or not
// Duplicate Counts
// Duplicate Letters

package JavaPractical.Day19;
import java.util.*;

public class String_Duplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String user_str = sc.nextLine().replace(" " , "");
		String str= user_str.toLowerCase();
		int count=0;
		int flag=0;
		
		ArrayList<Character> duplicate_letters= new ArrayList<>();		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j< str.length(); j++) {
				if(str.charAt(i)== str.charAt(j) && !duplicate_letters.contains(str.charAt(i))) {
					
					duplicate_letters.add(str.charAt(i));
					count++;
					flag=1;
				}
			}
		}
		if(flag==1) {
		System.out.println("Duplicate Letters are Present in the String!\nDuplicate Letters: "+duplicate_letters+"\nTotal: "+count);
		}
		else {
			System.out.println("No Duplicate Values are Present!");
		}
	}

}
