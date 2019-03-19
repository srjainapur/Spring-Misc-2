package com.java.thread;

public class LifeCycleMainApp {
	public static void main(String[] args) {
		ThreadLifeCycleDemo tld = new ThreadLifeCycleDemo("Thread1");
		tld.start();
		
		ThreadLifeCycleDemo tld2 = new ThreadLifeCycleDemo("Thread2");
		tld2.start();
		
		try {
			Thread.sleep(1000);
			tld.suspend();
			System.out.println("Suspending First Thread");
			Thread.sleep(1000);
			tld.resume();
			System.out.println("Resuming First Thread");

			tld2.suspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			tld2.resume();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
	}
}
