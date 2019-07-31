package multiThreadTest.callableTest;

import java.io.*;
import java.nio.file.*;

import java.util.concurrent.*;

public class Adder implements Callable<Integer> {
	private String inFile;
	public Adder(String inFile) {
		this.inFile=inFile;
	}
	
	public int doAdd() throws IOException{
		int total =0;
		String line =null;

		try(BufferedReader reader= Files.newBufferedReader(Paths.get(inFile))){
			while((line=reader.readLine())!=null) {
				total+= Integer.parseInt(line);				
			}
		}
		return total;
	}
	
	public Integer call() throws IOException{
		return doAdd();
	}

}
