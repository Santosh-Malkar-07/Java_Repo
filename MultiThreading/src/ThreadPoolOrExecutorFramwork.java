

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread1 implements Runnable {

	String name;

	public MyThread1(String name) {
		this.name = name;
	}

	public void run() {

		System.out.println(name + "       Job started by thread        " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
	//	System.out.println(name + "        Job Completed by thread          " + Thread.currentThread().getName());
		System.out.println();
	}

}

public class ThreadPoolOrExecutorFramwork {

	public static void main(String[] args) {

		MyThread1[] myThread1 = { new MyThread1("Santosh"), new MyThread1("Priyanka"), new MyThread1("Sneha"),
				new MyThread1("Rani"), new MyThread1("Yogita"), new MyThread1("Pranjal") };

		ExecutorService executorService = Executors.newFixedThreadPool(4);

		for (MyThread1 data : myThread1) {
			executorService.submit(data);
		}
		executorService.shutdown();
	}

}
