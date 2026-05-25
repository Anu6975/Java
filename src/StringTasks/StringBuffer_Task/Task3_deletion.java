package StringBuffer_Task;

public class Task3_deletion {

	public static void main(String args[]) {
		StringBuffer r = new StringBuffer("Hello!! My name is Anuja");
		
		r.delete(6, 24);
		System.out.println(r);	
	}
}
