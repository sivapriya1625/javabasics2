package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread {

	public WorkerThread(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//hiring 5 people
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for(int i=0; i<10; i++) {
			Runnable worker = (Runnable) new WorkerThread("job no "+i);
			executorService.execute(worker);
		}

		executorService.shutdown();

	}


	}

