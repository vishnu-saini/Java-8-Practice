package com.example.java8.java8functionalpackageuse;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Main {

	public static void main(String[] args) {

		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70);
		Fruit apple = new Fruit("Apple", "Apple description",100);
		Fruit orange = new Fruit("Orange", "Orange description",80);
		Fruit banana = new Fruit("Banana", "Banana description",90);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		List<Fruit> list=Arrays.asList(pineappale,apple,orange,banana);
		
		consumeCollection(list, f -> System.out.println("Consuming fruite : "+f.getFruitName()));
	}
	
	
	private static void consumeCollection(List<Fruit> list,Consumer<Fruit> consumer) {
		for (Fruit fruit : list) {
			consumer.accept(fruit);
		}

	}
}

