package com.java.thread;

public class ThreadLifeCycleDemo implements Runnable {

	public Thread t;
	private String threadName;
	private boolean suspend = false;
	
	public ThreadLifeCycleDemo(String tName) {
		threadName = tName;
		System.out.println("Creating thread " + threadName);
	}
	
	public void run() {
		System.out.println("Running " + threadName);

		try {
			for (int i = 10; i > 0; i--) {
				System.out.println("Thread : " + threadName + " , " + i);

				// Let the thread sleep for a while
				Thread.sleep(50);
				
				synchronized (this) {
					while(suspend) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}
	
	public void start() {
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	void suspend() {
		suspend = true;
	}
	
	synchronized void resume() {
		suspend = false;
		notify();
	}	
}
