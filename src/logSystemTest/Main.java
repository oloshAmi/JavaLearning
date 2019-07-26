package logSystemTest;

import java.io.*;
import java.util.logging.*;


public class Main {
	
	static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
/*		logger.setLevel(Level.FINE);
		logger.log(Level.SEVERE,"Uh Oh!");
		logger.log(Level.INFO,"Just So you know");
		logger.log(Level.FINE,"Hey Dev Dude");
		logger.log(Level.FINEST,"Hey snowflake");
*/		
		Handler h= new ConsoleHandler();
		Formatter f= new SimpleFormatter();
		h.setFormatter(f);
		logger.addHandler(h);
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO,"We're logging!");
		
		try {
		FileHandler fH= new FileHandler("%h/myapp_%g.log",1000,4);
		fH.setFormatter(new SimpleFormatter());
		logger.addHandler(fH);
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO,"We're logging!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
