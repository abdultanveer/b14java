package rjt.b14.threads;

public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("my thread group");
		
		Thread t1 = new Thread(tg1, runnable,"one");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Thread t2 = new Thread(tg1, runnable,"two");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		
		Thread t3 = new Thread(tg1, runnable,"three");
		t3.start();
		
		//System.out.println("thread list = ");
		tg1.list();
	}

}
