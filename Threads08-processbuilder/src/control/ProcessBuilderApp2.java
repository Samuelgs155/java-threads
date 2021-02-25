package control;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ProcessBuilderApp2 {

	public static void main(String[] args) {
		
		ProcessBuilder dirProcess = new ProcessBuilder("cmd");
		//File comandos = new File("E:\\06_workspace_java\\09_java_threads\\procesos\\comandos.bat");
		File dirOut = new File("E:\\06_workspace_java\\09_java_threads\\procesos\\out.txt");
		File dirErr = new File("E:\\06_workspace_java\\09_java_threads\\procesos\\err.txt");
		//dirProcess.redirectInput(comandos);
		dirProcess.redirectOutput(dirOut);
		dirProcess.redirectError(dirErr);
		try {
			dirProcess.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
