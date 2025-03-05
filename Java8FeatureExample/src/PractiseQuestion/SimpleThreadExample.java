package PractiseQuestion;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class SimpleThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread thread1 = new MyThread();
		thread1.start();
		
		System.out.println("Main thread: "+Thread.currentThread().getName());
	}

}
