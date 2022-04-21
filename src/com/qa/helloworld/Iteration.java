package com.qa.helloworld;

public class Iteration {
 
	public static void main(String[] args) {
		
		int A = 100;
		boolean ACount = true;
		
		while(ACount) {
			System.out.println("A : " +A);
			A++;
			
			if(A>200) {
				ACount = false;
		}
		}
		System.out.println("True");
	}
}
