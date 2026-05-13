package Day2;
import java.util.Scanner;

public class scanner_class {

	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Name: ");
		String name= s.next();
		
		System.out.println("Age: ");
		int age= s.nextInt();
		
		System.out.println("Date of Birth (DD/YY/MM): ");
		String dob= s.next();
		
		System.out.println("Mobile Number: ");
		int mob= s.nextInt();
		
		System.out.println("E-mail: ");
		String email= s.next();
		
		System.out.println("Adhar Card Number: ");
		int adhar= s.nextInt();
		
		
		System.out.print("\nEducation Details");
		
		
		System.out.print("Education: ");
		String edu= s.nextLine();
		
		System.out.println("Collage Name: ");
		String college= s.nextLine();
		
		System.out.println("University: ");
		String uni= s.nextLine();
		
		System.out.println("CGPA: ");
		Float cgpa= s.nextFloat();
		
		System.out.println("\nBank Account Details: ");
		
		System.out.println("Bank Name: ");
		String bank= s.nextLine();
		
		System.out.println("Bank Branch: ");
		String branch= s.nextLine();
		
		System.out.println("Account Number: ");
		int acc= s.nextInt();
		
		System.out.println("IFSC Code: ");
		String ifsc = s.next();
		
		
	
		
		System.out.println("\n\nReview of Registration Form: \n");
		
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);	
		System.out.println("Date of Birth (DD/YY/MM): "+ dob);
		System.out.println("Mobile Number: "+ mob);
		System.out.println("E-mail: "+ email);
		System.out.println("Adhar Card Number: "+ adhar);
		
		System.out.println("\n Education Details");
		System.out.println("Education: "+ edu);
		System.out.println("Collage Name: "+ college);		
		System.out.println("University: "+ uni);
		System.out.println("CGPA: "+ cgpa);
		
		System.out.println("\nBank Account Details: ");
		System.out.println("Bank Name: " + bank);
		System.out.println("Bank Branch: "+ branch);
		System.out.println("Account Number: "+ acc);
		System.out.println("IFSC Code: "+ ifsc);
	}
}
