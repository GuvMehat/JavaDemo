package com.qa.helloworld;


public class DemoOfStrings {

	public static void main(String args[]) {
		String str1 = "today it is sunny";
		String str2 = "yesterday it was raining";

		// Print out both strings in all caps
		System.out.println(str1.toUpperCase() + ", " + str2.toUpperCase());

		// Use substring to print TODAY IT IS RANING
		String str3 = str1.substring(0, 11);
		String str4 = str2.substring(16, 24);
		System.out.println(str3.toUpperCase() + str4.toUpperCase());

	}
}
