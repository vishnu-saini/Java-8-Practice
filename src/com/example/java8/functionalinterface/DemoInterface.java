package com.example.java8.functionalinterface;


@FunctionalInterface
public interface DemoInterface {
	public void DemoMethod();
	/*adding below method will give error because of functionInterface annotation*/
	//public void DemoMethod1();
}
