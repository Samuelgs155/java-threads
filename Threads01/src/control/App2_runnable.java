package control;

import control.runnable.RunnerRunnable;

public class App2_runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnerRunnable());
		Thread t2 = new Thread(new RunnerRunnable());
		t1.start();
		t2.start();
	}

}
