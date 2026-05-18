/*  Instagram User Login */

import java.util.Scanner;

public class Task2{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);

		String username = "user_name123";
		String password = "password123";

		System.out.print("Enter Username: ");
		String user= s.next();

		System.out.print("Enter Password: ");
		String pass = s.next();


		if(username.equals(user) &&  password.equals(pass)){
			System.out.println("Login Successful!! ");
		}
		else{
			System.out.println("Wrong Password or Username! \nEnter Again!");
		}
	}



}