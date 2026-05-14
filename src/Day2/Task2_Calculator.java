import java.util.Scanner;

public class Task2_Calculator{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Number of Digits to perform Operations on(2/3): ");
		int digits=s.nextInt();

		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division ");
		System.out.println("Enter The Operation to perform(1/2/3/4): ");
		int op=s.nextInt();
		
		if(digits==2){
		System.out.print("Enter First  Number: ");
		int a=s.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b=s.nextInt();

		switch(op){
			case 1:
				System.out.printf("%d + %d = %d", a,b,a+b);
				break;
			  
			case 2:
				System.out.printf("%d - %d = %d", a,b,a-b);
				break;

			case 3:
				System.out.printf("%d * %d = %d", a,b,a*b);
				break;

			case 4:
				System.out.printf("%d / %d = %d", a,b,a/b);
				break;
			default:
				System.out.print("Invalid Input!!");
				break;
			}
		}

		else if(digits==3){
		
		System.out.print("Enter First  Number: ");
		int a=s.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b=s.nextInt();

		System.out.print("Enter Third Number: ");
		int c=s.nextInt();

		switch(op){
			case 1:
				System.out.printf("%d + %d + %d = %d", a, b, c, a+b+c);
				break;
			  
			case 2:
				System.out.printf("%d - %d - %d = %d", a,b,c,a-b-c);
				break;

			case 3:
				System.out.printf("%d * %d * %d = %d", a, b, c, a*b*c);
				break;

			case 4:
				System.out.printf("%d / %d  / %d = %d", a, b, c, a/b);
				break;

			default:
				System.out.print("Invalid Input!!");
				break;
			}
		}
		
		else{
		System.out.print("Invalid Input!!");
		}
}
}