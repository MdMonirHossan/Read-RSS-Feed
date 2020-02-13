
class Thread_A extends Thread{

	public void run(){
		for(int i=1; i<5; i++){
			System.out.println("First Thread");
			try{Thread.sleep(1000);} catch(Exception e){}
		}
	}

}

class Thread_B extends Thread{

	public void run(){
		for(int i=1; i<5; i++){
			System.out.println("Second Thread");
			try{Thread.sleep(800);} catch(Exception e){}
		}
	}
}

public class Threads{

	public static void main(String[] args){

		Thread_A A = new Thread_A();
		Thread_B B = new Thread_B();

		A.start();
		B.start();

	}
}