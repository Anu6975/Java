
package Day8;
 
class Student
{
	 int sid;
	 String sname;
	
	 Student(int x,String y) // Para Constructor	
	 {
		 sid = x;
		 sname = y;
	 }
	
	 // Copy Con
	 Student(Student s) // s=s.sid=101,s.sname="Ravi"
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

public class copy_constructor
{
 
	public static void main(String[] args)
	{
	
		Student s1=new Student(101,"Ravi"); //Parameterized Constructor s1.sid=101,s1.sname="Ravi"
		s1.display();
		
		
		Student s2=new Student(s1); // s1.sid,s1.sname; 101 and Ravi
		s2.display();
		
		Student s3=new Student(s2); // Copy Constr
		s3.display();
 
 
	}
 
}