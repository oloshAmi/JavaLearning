package scriptGenerator;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.hamcrest.Matchers;
import org.junit.Test;

public class FileListTest {
	
	@Test
	public void shouldReturnAllFiles() {
		final List<String> fileNames= Arrays.asList("assignment3.r","assignment4.r");
		final List<File> nFiles=returnFileList("C:\\pythonCodesLearn\\rFiles");
		final List<String> allFiles=new ArrayList<>();
		for (File oneFile:nFiles) {
			allFiles.add((String)oneFile.getName());
		}
		//assertEquals(fileNames.get(1),allFiles.get(1));
		assertThat(allFiles,Matchers.containsInAnyOrder(fileNames));
	}

	@Test
	public void shouldReturnOnlyRFiles() {
		final List<File> nFiles=returnFileList("C:\\pythonCodesLearn\\rFiles");
		final List<String> allFiles=new ArrayList<>();
		for (File oneFile:nFiles) {
			allFiles.add((String)oneFile.getName());
		}
		
		assertThat(allFiles,Matchers.everyItem(Matchers.containsString(".r")));
	}
	
	private List<File> returnFileList(String rootPath){
		final FileList_old nList=new FileList_old(rootPath);
		return nList.getFileList();
	}

}
