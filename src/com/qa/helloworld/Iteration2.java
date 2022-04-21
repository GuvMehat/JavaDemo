package com.qa.helloworld;

public class Iteration2 {
	
	public static void main(String[] args) {
		
		int A = 100;
		boolean ACount = true;
		
		while(ACount) {
			if(A%2==0) {
			System.out.println("A : " +A +"-");}
			else 
				System.out.println("A : " +A +"*");
			A++;
			
			if(A>=200) {
				ACount = false;
		}
		}
		System.out.println("True");
	}
}


