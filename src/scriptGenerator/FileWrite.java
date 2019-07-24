package scriptGenerator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class FileWrite {
	private Path targetPath;
	private List<String> commandList;
	public FileWrite(String targetFileName,List<String> commandList) {
		this.targetPath=Paths.get(targetFileName);
		this.commandList=commandList;
	}
	
	public void writeData() throws IOException{ 
		try(BufferedWriter bw=Files.newBufferedWriter(this.targetPath, StandardCharsets.ISO_8859_1)){
			for(String currentCommand:this.commandList) {
				bw.write(currentCommand);
				bw.write("\n");
			}			
		}
		System.out.println("File written in "+ this.targetPath);
		
	}

}
