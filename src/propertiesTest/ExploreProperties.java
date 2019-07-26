package propertiesTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ExploreProperties {
	public static void main(String[] args) {
		Properties defaultProps=new Properties();
		try{
			try(InputStream inputStream=ExploreProperties.class.getResourceAsStream("MyDefaultValues.xml"))
			{
				defaultProps.loadFromXML(inputStream);
			}
			Properties userProps= new Properties(defaultProps);
			loadUserProps(userProps);
			
			String welcomeMessage= userProps.getProperty("welcomeMessage");
			String farewellMessage= userProps.getProperty("farewellMessage");
			
			System.out.println(welcomeMessage);
			System.out.println(farewellMessage);
			
			if(userProps.getProperty("isFirstRun").equalsIgnoreCase("Y")) {
				userProps.setProperty("welcomeMessage", "Welcome Back");
				userProps.setProperty("farewellMessage", "Things will be familiar now");
				userProps.setProperty("isFirstRun", "N");
				saveUserProps(userProps);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		Map<String, String> envVars= System.getenv();
		System.out.println(envVars);




		/*	props.setProperty("displayName", "Sejan");
	props.setProperty("accountNumber", "123-987");

	try(BufferedWriter writer=Files.newBufferedWriter(Paths.get("xyz.properties"))){
		props.store(writer, "Commenting is optional");
	}catch(Exception e) {
		e.printStackTrace();
	}*/

		/*try(BufferedReader reader=Files.newBufferedReader(Paths.get("xyz.properties"))){
		props.load(reader);
	}catch(Exception e) {
		e.printStackTrace();
	}

	System.out.println(props.getProperty("displayName"));
	System.out.println(props.getProperty("accountNumber"));*/

	}
	private static Properties loadUserProps(Properties userProps) throws IOException{
		Path userFile=Paths.get("userValues.xml");
		if(Files.exists(userFile)) {
			try(InputStream inputStream = Files.newInputStream(userFile)){
				userProps.loadFromXML(inputStream);
			}
		}
		return userProps;
	}
	
	private static void saveUserProps(Properties userProps) throws IOException{
		try(OutputStream outputStream=Files.newOutputStream(Paths.get("userValues.xml"))){
			userProps.storeToXML(outputStream,null);
		}
	}

}
