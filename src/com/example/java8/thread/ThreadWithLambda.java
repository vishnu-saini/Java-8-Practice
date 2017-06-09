package com.example.java8.thread;

public class ThreadWithLambda {

	public static void main(String[] args) {
		
		Thread thread=new Thread(() -> { System.out.print("hi I am running"); });
		thread.start();
		
	}

}
