package Day8;

class Copy_Constructor{
	 int sid;
	 String sname;
	
	Copy_Constructor(int x, String y) {
		
		 sid = x;
		 sname = y;
	}
	
	 // Copy Con
	 Copy_Constructor(Copy_Constructor s) // s=s.sid=101,s.sname="Ravi"
	 {
		  sid=s.sid;
		  sname=s.sname;
	 }
	
	 void display()
	 {
		 System.out.println("Student id is: " + sid);
		 System.out.println("Student name is: " + sname);
	 }
	
}


public class copy_constructor {
	
	public static void main(String [] ar) {
		Copy_Constructor c = new Copy_Constructor(20, 'Anuja');
		
		C s2=new Student(s1); // s1.sid,s1.sname; 101 and Ravi
		s2.display();
		
		Student s3=new Student(s2); // Copy Constr
		s3.display();
		
	
	}

}
