package com.qa.helloworld;

public class Coins {

	public static void main(String[] args) {

		Task(83.28, 100);
	}

	public static void Task(double price, double note) {

		// note value
		double a = 10;
		double b = 5;
		double c = 0.20;
		double d = 0.02;

		// rounds down the number of divisions to get whole number of notes
		double a2 = 0;
		double b2 = 0;
		double c2 = 0;
		double d2 = 0;

		// new remainder
		double num = note - price;
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;

		// check £10
		if (num >= a) {
			double a1 = num / a;
			a2 = Math.floor(a1);
			num1 = num - a * a2;
		} else {
			num1 = num;
		}
		System.out.println("Amount of £" + a + " : " + a2);

		// check £5
		if (num1 >= b) {
			double b1 = num1 / b;
			b2 = Math.floor(b1);
			num2 = num1 - b * b2;
		} else {
			num2 = num1;
		}
		System.out.println("Amount of £" + b + " : " + b2);

		// check 20p
		if (num2 >= c) {
			double c1 = num2 / c;
			c2 = Math.floor(c1);
			num3 = num2 - c * c2;
		} else {
			num3 = num2;
		}
		System.out.println("Amount of £" + c + " : " + c2);

		// check 2p
		if (num3 >= d) {
			double d1 = num3 / d;
			d2 = Math.floor(d1);
			num4 = num3 - d * d2;
		} else {
			num4 = num3;
		}
		System.out.println("Amount of £" + d + " : " + d2);

		System.out.println("Remainder : " + num4);
	}
}