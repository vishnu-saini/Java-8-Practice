package com.example.java8.collectionhandling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		
		Collections.sort(list,(f1,f2)-> f1.getFruitName().compareTo(f2.getFruitName()));
		
		for (Fruit fruit : list) {
			System.out.println(fruit.getFruitName());
		}
		
		System.out.println("below is conditional printing");
		condiationPrint(list, f -> f.getFruitName().length() > 5);
	}
	
	
	private static void condiationPrint(List<Fruit> list,Condition condition) {
		// TODO Auto-generated method stub
		for (Fruit fruit : list) {
			if(condition.test(fruit))
			System.out.println(fruit.getFruitName());
		}

	}
}

interface Condition{
	public boolean test(Fruit f);
}
