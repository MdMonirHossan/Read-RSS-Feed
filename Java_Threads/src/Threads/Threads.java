package Threads;

import java.util.TimerTask;


// Running Thread 1 extending TimerTask
class RunA extends TimerTask{
	
	public void run() {
		
		ThreadA A = new ThreadA();
		A.start();
	}
}

//Running Thread 2 extending TimerTask
class RunB extends TimerTask{
	public void run() {
		
		ThreadB B = new ThreadB();
		try {
			Thread.sleep(5000);  // Run Thread 2 after 5 second.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		B.start();
	}
}
















