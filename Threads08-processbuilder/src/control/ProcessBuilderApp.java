package control;

import java.util.Map;

public class ProcessBuilderApp {

	public static void main(String[] args) {
		
		ProcessBuilder testProcesos = new ProcessBuilder();
		
		Map environmentMap = testProcesos.environment();
		System.out.println(environmentMap);
		
		// forma usual
		System.out.println("");
		System.out.println(System.getenv());
	}

}
