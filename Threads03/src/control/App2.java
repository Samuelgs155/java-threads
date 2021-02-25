package control;

public class App2 {
	
	private int count = 0;

	public static void main(String[] args) {
		App2 app = new App2();
		app.doWork();
	}
	
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}				
			}			
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}				
			}			
		});
		
		t1.start();
		t2.start();
		
		// wait until t1 and t2 ends
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Count is : " + count);
	}

}
