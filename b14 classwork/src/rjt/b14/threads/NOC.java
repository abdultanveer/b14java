package rjt.b14.threads;

public class NOC {

	public static void main(String[] args) {
		PrinterThread printerThread;
		printerThread = new PrinterThread();
		printerThread.start();
		
		NWThread nwThread = new NWThread();
		nwThread.start();
		
		DBThread dbThread = new DBThread();
		dbThread.start();
	}

}
