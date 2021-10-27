package Threads;

public class OfficeBoy {
	public static void main(String[] args) {

		FeeThread feeThread = new FeeThread();
		feeThread.start();
		OfficeBoy ramu = new OfficeBoy();
		ramu.start();


	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

}
