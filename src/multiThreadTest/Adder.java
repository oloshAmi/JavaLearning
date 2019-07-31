package multiThreadTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Adder implements Runnable{
	private String inFile, outFile;
	public Adder(String inFile, String outFile) {
		this.inFile=inFile;
		this.outFile=outFile;
	};

	public void doAdd() throws IOException {
		int total =0;
		String line =null;

		try(BufferedReader reader= Files.newBufferedReader(Paths.get(inFile))){
			while((line=reader.readLine())!=null) {
				total+= Integer.parseInt(line);				
			}
		}
		try(BufferedWriter writer= Files.newBufferedWriter(Paths.get(outFile))){
			writer.write("Total: "+ total);
		}

	}
	
	public void run() {
		try {
			doAdd();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


}
