package JavaPractical.JavaPractice;
import java.util.Scanner;

public class String_FirstNoRepeatChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine().toLowerCase();
		int count=0;
		
//		int count=0, count2=0, found=0;;
//		
//		char[] repeated = new char[str.length()];
//		char[] not_repeated = new char[str.length()];
		
//		for(int i=0; i<str.length(); i++) {
//			for(int j=i+1; j<str.length(); j++) {									// logic is not ideal in this case its ideal for duplicate elements, max/minimum array							
//				if(str.charAt(i)== str.charAt(j)) {														
//					repeated[count]=str.charAt(i);
//					count++;
//					found=1;
//				}
//			}
//			if(found==0) {
//				not_repeated[count2]=str.charAt(i);
//				count2++;
//			}
//			found=0;
//		}
		
		
//		if(count2 > 0)
//			System.out.print("First Not Repeated Character: "+ not_repeated[0]);
//		else
//			System.out.print("No Non-Repeated Characters!");
		
		
		
		for(int i=0; i<str.length(); i++) {
			count=0;
			for(int j=0; j<str.length(); j++) {
				 if(str.charAt(i)==str.charAt(j))
				        count++;
			}
			if(count==1)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
