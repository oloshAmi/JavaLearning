package scriptGenerator;
import static java.nio.file.FileVisitResult.CONTINUE;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class PathList {
	private Path rootPath;
	private List<Path> pathList=new ArrayList<>();
	private String pattern;

	public PathList(String rootPath,String pattern ) {
		this.rootPath=Paths.get(rootPath);
		this.pattern=pattern;
	}

	public List<Path> getPathList() throws IOException{
		validateFileNames();		
		return this.pathList;
	}

	public List<Path> getPathList(Boolean choice) throws IOException{
		readFileNames();
		return this.pathList;
	}
	private void validateFileNames() throws IOException {
		readFileNames();
		List<Path> pathToDeleteList=new ArrayList<>();
		for(Path curPath:this.pathList) {
			if(!curPath.toString().endsWith(this.pattern)) {
				pathToDeleteList.add(curPath);
			}
		}
		this.pathList.removeAll(pathToDeleteList);
		if (this.pathList.isEmpty()) {
			System.out.println("Empty path list, output File will be empty!");
		}

	}

	private void readFileNames() throws IOException {
		FileVisit visitFile= new FileVisit();
		Files.walkFileTree(this.rootPath, visitFile);
		this.pathList=visitFile.getPaths();
	}


	//I am not sure if this is right design or the below should be a public class.
	//This hides the FileVisit class and it has to be new() inside a class
	//Such is against TDD but I see no reason to make this class known to other classes in the package
	//Copied then edited from Oracle docs
	private static class FileVisit extends SimpleFileVisitor<Path>{
		private List<Path> filePaths= new ArrayList<>();

		private List<Path> getPaths(){
			return this.filePaths;
		}

		// each type of file.
		@Override
		public FileVisitResult visitFile(Path file,
				BasicFileAttributes attr) {			
			if (attr.isRegularFile()) {
				this.filePaths.add(file);
			}
			return CONTINUE;
		}

	}

}
