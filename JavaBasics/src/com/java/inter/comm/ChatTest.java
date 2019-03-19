package com.java.inter.comm;

public class ChatTest {
	public static void main(String[] args) {
		Chat m = new Chat();
		new Thread1(m);
		new Thread2(m);
	}
}
