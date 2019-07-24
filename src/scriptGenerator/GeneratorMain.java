package scriptGenerator;
import java.util.*;
import java.nio.file.*;
public class GeneratorMain {

	public static void main(String[] args) {
		List<Path> pathList= new ArrayList<>();		
		List<String> commandList= new ArrayList<>();		
		String rootPath="C:\\pythonCodesLearn\\rFiles";
		String targetPath="C:\\pythonCodesLearn\\rFiles\\newFile.txt";
		String pattern=".r";
		
		PathList paths=new PathList(rootPath,pattern);
		try {
		pathList=paths.getPathList();
		CommandList commands=new CommandList(pathList);
		commandList=commands.getCommandList();
		FileWrite writeFile= new FileWrite(targetPath,commandList);
		writeFile.writeData();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
