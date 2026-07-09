package JavaPractical.JavaPractice;
import java.util.*;

public class C2_String_FrequencyCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = sc.nextLine().toLowerCase();
		
		int n=str.length();
		int count=0, cnt=0;;
		char[] printed=new char[n];
		
		for(int i=0; i<n; i++) {
			count=1;
			for(int j=i+1; j<n; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			Boolean found=false;
			for(int k=0; k<cnt ;k++) {
				if(printed[k] ==str.charAt(i)) {
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println(str.charAt(i) +": "+count);
				printed[cnt]= str.charAt(i);
				cnt++;
			}
		}
	}
}
