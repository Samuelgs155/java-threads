package control.threads;

public class Processor extends Thread {
	
	private boolean running = true;

	@Override
	public void run() {
		while(running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		this.running = false;
	}
	
	

}
