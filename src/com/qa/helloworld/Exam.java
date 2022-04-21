package com.qa.helloworld;


public class Exam {
	
	
	 public static void main(String[] args) {
		
	     
		 int BE = 80;
		 int PE = 150;
		 int CE = 50;
	
	System.out.println("Biology exam results: " + BE + " /150");
	System.out.println("Physics exam results: " + PE + " /150");
	System.out.println("Chemisty exam results: " + CE + " /150");
	
	Double Exam = (double) (((BE + PE + CE) *100) /450);
	System.out.println("Total Precentage For All Exams: " + Exam +"%");
	
	
	if (Exam > 60 && BE > 60 && PE > 60 && CE > 60 ) {
		System.out.println("Well Done you have Passed");
	}else {
		System.out.println("Fail");
	}
		
	 }
}
