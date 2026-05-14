import java.util.Scanner;
public class Task3_AreaCalc{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double pi = 3.14;
	
		System.out.println("		**Area Calculator** ");
		System.out.println("1. Rectangle  \n2.Triangle \n3. Circle \n4. Square");
		System.out.print("Enter Your Choice (1/2/3/4): ");
		int ch = s.nextInt();

		switch(ch){
			case 1:
				System.out.print("Enter Length of Rectangle: ");
				int len= s.nextInt();

				System.out.print("Enter Width of Rectangle: ");
				int wid = s.nextInt();

				System.out.print("Area of Rectangle is: " + (len*wid));
				break;
			case 2:
				System.out.print("Enter Base of Triangle: ");
				int base = s.nextInt();

				System.out.print("Enter Height of Triangle: ");
				int height = s.nextInt();

				System.out.print("Area of Triangle is: " + (base*height)/2);
				break;

			case 3:

				System.out.print("Enter Radius of Circle: ");
				int radius= s.nextInt();

				System.out.print("Area of Circle is: " + (radius*radius) * pi);
				break;

			case 4:

				System.out.print("Enter Side of Square: ");
				int side= s.nextInt();

				System.out.print("Area of Square is: " + (side*side));
				break;

			default:
				System.out.print("Invalid Input");
				break;
		}
	}
}