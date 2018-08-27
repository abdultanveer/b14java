package rjt.b14.threads;

public class DbLookup extends Thread {
	
	public DbLookup(String string) {
		super(string);
	}

	@Override
	public void run() {
		/*super.run();
		System.out.println("this is a blocking call -- downloading 100gb");
	*/
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);// i am forcing this thread to sleep for 1 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
		
	}

}
