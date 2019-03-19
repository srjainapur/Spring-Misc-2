package com.java.inter.comm;

public class Chat {
	boolean flag = false;
	
	public synchronized void Question(String message) {
		if(flag) {
			
			try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		System.out.println(message);
		flag=true;
		notify();
	}
	
	public synchronized void Answer(String msg) {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag=false;
		notify();
	}
}
