package Day9;

class person{
	int id;
	String name;
	person(){
		System.out.println("Person Constructor");
	}
	void displayInfo() {
		System.out.println(id+". "+name);
	}
}

class Student extends person{
	String branch;
	Student(){
		System.out.println("Student Constructor");
	}
	
	void study() {
		System.out.println("Branch: "+branch);
	}
}

class GraduateStudent extends Student{
	String researchTopic;
	
	GraduateStudent(){
		System.out.println("GraduateStudent Constructor");
	}
	
	void research() {
		System.out.println("Research Topis: "+researchTopic);
	}
}

class Professor extends person{
	String subject;
	
	Professor(){
		System.out.println("Professor Constructor");
	}
	void teach() {
		System.out.println("Professor Subject: "+subject);
	}
}

class LabAssistant extends person{
	String labName;
	LabAssistant(){
		System.out.println("LabAssistance Constructor");
	}
	void assistLab() {
		System.out.println(labName+" Lab Assistant");
	}
	
}

public class Smart_University_System {
	public static void main(String[] a) {
		GraduateStudent g = new GraduateStudent();
		
	}
}
