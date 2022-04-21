package com.qa.helloworld;

public class Arrays {

	public static int ageArray[];



	public static void A(String[] args) {
		for (int i : ageArray) {
			System.out.println("Age: " + i);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i > ageArray.length; i++) {
			ageArray[i] = i * 10;
			System.out.println(ageArray);

		}
	}
}
