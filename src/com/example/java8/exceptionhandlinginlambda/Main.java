package com.example.java8.exceptionhandlinginlambda;

import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 0, 4 };
		int key = 10;

		process(numbers, key, lambaExceptionWrapper((a, b) -> System.out.println(b / a)));

	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : numbers) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> lambaExceptionWrapper(BiConsumer<Integer, Integer> consumer) {
		return (a, b) -> {
			try {
				consumer.accept(a, b);
			} catch (ArithmeticException e) {
				System.out.println("there is some exception");
			}

		};

	}
}
