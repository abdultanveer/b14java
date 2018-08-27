package rjt.b14.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService exService = 
				Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(""+i);
			exService.execute(worker);
		}
		exService.shutdown();
		while(!exService.isTerminated()) {}
		System.out.println("finished");
	}

}
