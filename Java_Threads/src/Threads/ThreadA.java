package Threads;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ThreadA extends Thread {
	
	public void run(){
		
			try{
				FileWriter writer = new FileWriter("/Users/MDMONIRHOSSAN/Documents/Java_Thrads/a.rss");
				
				// Fetch news content from url.
				writer.write(readRSSFeed("http://rss.cnn.com/rss/edition.ss", "<title><![CDATA[", "]]></title>"  ));
				
				// Fetch image url from site.
				writer.write(readRSSFeed("http://rss.cnn.com/rss/edition.ss", "url=\"", "\" height"));
				
				writer.close();  // close writer.
				} 
			catch(Exception e){
				System.out.print(e);
			}
	}
	
	
	// Method which read news content and image url from rss site.
	public String readRSSFeed(String RSSUrl, String startString, String endString) {
				
			try {
				URL url = new URL(RSSUrl);
				BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
				String sourceCode = "";
				String line ;
				while((line = in.readLine()) != null) {
					int endIndex = 0;
					int startIndex = 0;
					while(startIndex >= 0) {
						startIndex = line.indexOf(startString, endIndex );
						if (startIndex >= 0) {
							endIndex = line.indexOf(endString, startIndex);
							sourceCode += line.substring(startIndex + startString.length(), endIndex) + "\n";
						}
					}
				}
				in.close();
				
				return sourceCode;
			} catch (MalformedURLException e) {
				System.out.println("Url not found!" + e);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return RSSUrl;
		}
	
}
