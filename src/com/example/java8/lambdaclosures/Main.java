package com.example.java8.lambdaclosures;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		doProcess(40, new Process() {

			@Override
			public void process(int i) {
				System.out.println(i + a);
				/*
				 * previous to java 8 It would have given error, if we have not
				 * define is as final and used inside anonymous class
				 */

			}
		});

		doProcess(50, i -> System.out.println(i + a));

	}

	public static void doProcess(int i, Process pro) {
		pro.process(i);
	}
}

interface Process {
	void process(int i);
}