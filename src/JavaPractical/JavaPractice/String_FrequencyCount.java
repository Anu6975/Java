package JavaPractical.JavaPractice;
import java.util.*;

public class String_FrequencyCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = sc.nextLine().toLowerCase();
		
		int n=str.length();
		int count=0, cnt=0;;
		char[] printed=new char[n];
//		String printed = "";
		for(int i=0; i<n; i++) {
			count=0;
			for(int j=0; j<n; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			int found=0;
			for(int k=0; k<cnt ;k++) {
				if(printed[k] ==str.charAt(i)) {
					found=1;
					break;
				}
			}
			
			if(found==0) {
				System.out.println(str.charAt(i) +": "+count);
				printed[cnt]= str.charAt(i);
				cnt++;
			}
		}
	}

}
