package control;

import java.util.Scanner;

import control.threads.Processor;

public class App {

	public static void main(String[] args) {
		Processor proc1 = new Processor();
		proc1.start();

		System.out.println("Press return to stop ......");
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();

		proc1.shutdown();
		
		if (!proc1.isAlive()) {
			System.out.println("END");
		}
	}

}
