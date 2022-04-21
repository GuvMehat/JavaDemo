package com.qa.helloworld;

public class Runner {

	public static void main(String[] args) {
		
		
		Person A = new Person (135, "A", 10, "Student", 18);
		Person B = new Person (156, "B", 7, "Engineer", 62);
		Person C = new Person (176, "C", 8, "Tradesman", 22);
		Person D = new Person (184, "D", 5, "Coder", 25);
		Person E = new Person (112, "E", 3, "Trader", 34);
		
		
		A.Greet();
		B.Greet();
		C.Greet();
		D.Greet();
		E.Greet();
		
	}

	
}
