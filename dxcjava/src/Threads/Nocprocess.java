package Threads;

public class Nocprocess {

	public static void main(String[] args) {

		FeeThread feeThread = new FeeThread();
		feeThread.start();
		OfficeBoy ramu = new OfficeBoy();
		ramu.start();


	}
	
	
}