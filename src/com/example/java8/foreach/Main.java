package com.example.java8.foreach;

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
		
		list.forEach(f->System.out.println(f.getFruitName()));
		
		list.forEach(System.out::println);
		
		
	}
	
	

}
