package StringBuffer_Task;

public class Task2_Insertion {
	public static void main(String arg[]) {
		StringBuffer sBuffer = new StringBuffer("Hello! Welcome To my");
		
		sBuffer.insert(20, " Console!");
		System.out.println(sBuffer);
	}

}
