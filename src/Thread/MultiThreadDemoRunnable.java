package Thread;


class Multithread2 implements Runnable{
	public void run(){
		try{
			System.out.println("Thread: " + Thread.currentThread().getId() + " is running");
		} catch(Exception e) {
			System.out.println("Exception is caught!!");
		}
	}
}

public class MultiThreadDemoRunnable{
	public static void main(String[] args){
		int n = 8;
		for(int i=0; i<8;i++){
			Thread object = new Thread(new Multithread2());
			//object.start();
		}
		Thread object2 = new Thread(new Multithread2());
		if (object2 != null){
			object2.interrupt();
			System.out.println("Thread stopped");
		}
	}
}
