package Day9;

class college{
	void cname() {
		System.out.println("College Name: Vishwakarma University");
		
	}
	
	void clocation() {
		System.out.println("College Location: Pune, Maharashtra");
	}
}

//1. Single Inheritance - Derived class(student class) inherits the methods and behavior of itself the base class (class college).

class students extends college{
	void name() {
		System.out.println("Name: Anuja");
	}
	
	void bike() {
		System.out.println("Bike: TVS Zest");
	}
}

// 2. Multilevel Inheritance: exam class has inherited both student and college behavior along with itself

class exam extends students{
	void result() {
		System.out.println("Grade: A++");
	}
}


// 3. Heirarichal Inheritance - student2 is also inhering properties of college class creating 2 derived classes of 1 college base class

class student2 extends college{
	void name() {
		System.out.println("Name: Om");
		
	}
	
	void bike() {
		System.out.println("Bike: None");
	}
}




class Inheritance {
	
	public static void main (String [] ar) {
		
//		students s1= new students();
//		
//		s1.cname();
//		s1.clocation();
//		
//		s1.name();
//		s1.bike();
		
		
		
		//Multilevel Inheritance Object
		
		exam e1 = new exam();
		
		e1.cname();
		e1.clocation();
		
		e1.name();
		e1.bike();
		
		e1.result();
		
		
		System.out.println("\n\n");
		// Hierarchical Inheritance
		
		student2 s2 = new student2();
		
		s2.cname();
		s2.clocation();
		s2.name();
		s2.bike();
		
	}

}
