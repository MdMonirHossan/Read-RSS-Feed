package Threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreadB extends Thread {
	
	
	public void run(){
		
		try {
			Pattern p = Pattern.compile("^http");
		    BufferedReader r = new BufferedReader(new FileReader("/Users/MDMONIRHOSSAN/Documents/Java_Thrads/a.rss"));
		      String line;
		      
		      while ((line = r.readLine()) != null) {
		         Matcher m = p.matcher(line);
		         while (m.find()) {
		            System.out.println(line);
		         }
		      }
		      r.close(); 
		    
		} catch (IOException e) {
			System.out.println("File not found" + e);
		}

			
	}
	

}
