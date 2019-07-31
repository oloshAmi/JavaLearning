package scriptGenerator;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;

public class CommandList {

	private List<String> commandList;
	private List<Path> pathList;
	public CommandList(List<Path>pathList) {		
		this.pathList=pathList;		
	}
	
	public List<String> getCommandList()throws IOException{
		readFile();
		return this.commandList;
	}

	private void readFile() throws IOException {
		List<String> temp=new ArrayList<>();
		for (Path curPath:this.pathList) {
			try(BufferedReader br= Files.newBufferedReader(curPath, StandardCharsets.ISO_8859_1)){
				String inValue;
				while((inValue=br.readLine())!=null) {
					if(inValue.contains("library")) {
						String libName=inValue.substring(inValue.indexOf('(')+1, inValue.indexOf(')'));
						if (inValue!=null||!inValue.isEmpty()) {
							temp.add(createdCommand(libName));
						}

					}else if(inValue.contains("install.packages")) {
						temp.add(createdCommand(inValue));						
					}
				}
			}
		}
		//HashSet removes the duplicates, but I really want it to be a list
		List<String> deDupStringList = new ArrayList<>(new HashSet<>(temp));
		this.commandList=deDupStringList;
	}

	private String createdCommand(String inValue){
		if(inValue.contains("install.packages")) {
			inValue=inValue.replace("#", "");
			inValue=inValue.replace(" ","");
			return inValue;
		}
		else {
			inValue=inValue.replace("\"", "");
			StringBuilder sb=new StringBuilder();
			sb.append("install.packages(\"");
			sb.append(inValue);
			sb.append("\")");
			return sb.toString();
		}
	}




}
