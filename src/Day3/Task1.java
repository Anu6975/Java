import java.util.Scanner;

public class Task1{

	public static void main(String [] args){
		float balance=20000;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Withdrawl Amount: ");
		int amount= s.nextInt();

		if(balance>=amount){
			System.out.println("Transaction Successful! Have a nice Day!!");
		}
		else{
			System.out.print("Transaction Failed!! \nInsufficient Balance! ");
		}
	}
}