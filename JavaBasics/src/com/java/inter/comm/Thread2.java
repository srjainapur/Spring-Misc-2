package com.java.inter.comm;

public class Thread2 implements Runnable {
	Chat m;
	String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

	public Thread2(Chat m2) {
	      this.m = m2;
	      new Thread(this, "Answer").start();
	   }

	public void run() {

		for (int i = 0; i < s2.length; i++) {
			m.Answer(s2[i]);
		}
	}
}
