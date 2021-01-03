package threading;

public class UsingThreadClass extends Thread {
	public void run() {
		System.out.println("thread is running...");
		
	}

	public static void main(String args[]) {
		UsingThreadClass t1 = new UsingThreadClass();
		t1.start();
		 
	}
}