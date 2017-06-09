package com.example.java8.functionalinterface;

public class Main {

	public static void main(String[] args) {
		callFunction(()-> System.out.println("this is demo mthod"));
	}

	public static void callFunction(DemoInterface d){
		d.DemoMethod();
	}
}
