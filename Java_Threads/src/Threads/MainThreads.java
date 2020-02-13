package Threads;

import java.util.Timer;

public class MainThreads {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.schedule(new RunA(), 0, 15000);  // Updating a.rss file every 15 second.
		timer.schedule(new RunB(), 0, 20000);  // Printing .jpg images every 20 second.
	}

}
