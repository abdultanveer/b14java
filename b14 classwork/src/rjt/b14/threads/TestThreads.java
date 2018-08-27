package rjt.b14.threads;

public class TestThreads {
	public static void main(String[] args) {
		//MyThread myThread = new MyThread();//new thread is created in m/y
		//myThread.start(); //im telling the scheduler my thread is ready 2b executed
		/*MyThreadInterFace mti = new MyThreadInterFace();
		Thread t1 = new Thread(mti);
		t1.start();*/
		
		DbLookup t1 = new DbLookup("first");
		DbLookup t2 = new DbLookup("second");
		DbLookup t3 = new DbLookup("third");

		
		
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t2.setName("SecondNew");
		System.out.println("isalive"+t1.isAlive());
		t2.start();
		t3.start();
		//t1.start();
	}

}
