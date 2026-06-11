package Day15;

class Runner extends Thread{
	public void run() {
		
		System.out.println("********Running Compitition*********\n");
		for(int i=0; i<5; i++) {
			System.out.println("Runner: Lap "+(i+1));
//			System.out.println(Thread.currentThread().getPriority()+". "+Thread.currentThread().getName());
		}
		System.out.println();
	}
}

class Swimmer extends Thread{
	public void run() {
		System.out.println("********Swimming Compitition*********\n");
		for(int i=0; i<5; i++) {
			System.out.println("Swimmer: Lap "+(i+1));
		}
		System.out.println();
	}
}

class Cyclist extends Thread{
	public void run() {
		System.out.println("********Cycling Compitition*********\n");
		for(int i=0; i<5; i++) {
			System.out.println("Cyclist: Lap "+(i+1));
		}
		System.out.println();
	}
}

public class Multithreading_SportsDay {
	public static void main(String a[]) throws InterruptedException {
		System.out.println("********Sports Event Started!*********\n");
		Runner r1  = new Runner();
		
		r1.join();
		
		Swimmer s1 = new Swimmer();
		r1.start();
		s1.start();
		r1.join();
		
		Cyclist c1 = new Cyclist();
		c1.start();
		c1.join();
		
		System.out.println("********Sports Event Ended!*********\n");
	}

}
