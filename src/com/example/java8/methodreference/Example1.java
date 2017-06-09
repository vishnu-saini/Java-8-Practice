package com.example.java8.methodreference;

public class Example1 {
	public static void main(String[] args) {
		Thread thread=new Thread(Example1::execute);
		thread.start();
	}
	
	
	public static void execute(){
		System.out.println("Hello");
	}
}
