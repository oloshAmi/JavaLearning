// The methods used here are from file.io , which might get deprecated in the future. 
//New class FileList.java contains code with java.nio., using Paths and Files.

package scriptGenerator;

import java.io.File;
import java.util.*;

public class FileList_old {
	private List<File> fileList=new ArrayList<>();
	private String pattern=".r";
	private String rootDirectory=null;

	public FileList_old(String rootDirectory){
		this.rootDirectory=rootDirectory;
		validateFileNames(readFileNames(this.rootDirectory));
	}

	public List<File> getFileList(){
		return this.fileList;
	}
	
	private void validateFileNames(List<File> fileNames) {
		//Remove non R files from the list
		List<File> removableFiles=new ArrayList<>();
		for (File file:fileNames) {
			if(!file.getName().endsWith(this.pattern)) {
				removableFiles.add(file);
			}
		}
		fileNames.removeAll(removableFiles);
		this.fileList=fileNames;
	}

	private List<File> readFileNames(String directoryName) {

		File directory=new File(directoryName);	
		List<File> resultList = new ArrayList<File>();

		// get all the files from a directory
		File[] fList = directory.listFiles();
		resultList.addAll(Arrays.asList(fList));
		for (File file : fList) {
			if (file.isDirectory()) {
				resultList.remove(file);
				resultList.addAll(readFileNames(file.getAbsolutePath()));
			}
		}
		return resultList;
	}


}
