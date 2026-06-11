package Day15;

public class Timer {
	public static void main(String a[]) throws InterruptedException{
		int sec, min=0;
		for(int j=0; j<5; j++) {
		for(int i=1; i<=60; i++) {
			Thread.sleep(1000);
			System.out.print(i+" ");
			
		}
		min++;
		System.out.println(min+" Min Complete!");
		}
		
	}

}
