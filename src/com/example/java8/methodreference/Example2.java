package com.example.java8.methodreference;

import java.util.function.Consumer;

public class Example2 {
	public static void main(String[] args) {
		
		
		execute(10, System.out::println); /* same as p-> System.out.println(p)*/
	}
	
	
	public static void execute(int a,Consumer<Integer> consumer){
		consumer.accept(a);
	}
}
