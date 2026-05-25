package Day8;

import java.util.Scanner;

class Calc{
	int num1, num2;
	
	Calc(){
		num1=25;
		num2=5;
		}
	
	void addition() {
		int a=23;
		int b=23;
		System.out.println(a+b);
	}
	void add() {
		System.out.println("Addition: "+ (num1+num2));
	}
	
	void sub() {
		System.out.println("Subtraction: "+ (num1-num2));
	}
	
	void div() {
		System.out.println("Division: "+ num1/num2);
	}
	
	void mul() {
		System.out.println("Multiplication: "+ num1*num2);
	}
	
	
}


public class Constructor {
	
	
	public static void main(String[] a) {
		Calc c= new Calc();
		
		c.add();
		c.sub();
		c.mul();
		c.div();
		
	}

}
