package com.example.java8.thisinlambda;

public class Main {
	
	public static void main(String[] args) {
		
		Main i=new Main();
		
		
		int a = 10;
		i.doProcess(40, new Process() {

			@Override
			public void process(int i) {
				/* System.out.println(i + a); */
				System.out.println(this);

			}
			
			@Override
			public String toString() {
				return "this is anonymous classs's this";
			}
		});

		i.execute();
		

	}
	
	public void execute(){
		doProcess(50, i -> System.out.println(" this ref is :"+this));
	}

	public void doProcess(int i, Process pro) {
		pro.process(i);
	}
	
	@Override
	public String toString() {
		return "Example1 class";
	}
}

interface Process {
	void process(int i);
}