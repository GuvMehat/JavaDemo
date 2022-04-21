package com.qa.helloworld;

public class TaskFlowcharts {

 
	
	public static void main(String[] args) {
		
		Task1(8,67,false);
	}
		
	private static void Task1(int num1, int num2, boolean bool) {
				
				
				if (bool) { 
					System.out.println(num1+num2);
				}
				else 
				System.out.println(num1*num2);
	
	}
}