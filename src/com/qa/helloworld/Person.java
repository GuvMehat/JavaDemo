package com.qa.helloworld;

public class Person {
	
	//Attributes
private int Height;
private String Name;
private int ShoeSize;
private String JobTitle;
private int age; 

	//Constructor
public Person(int Height, String Name,int ShoeSize, String JobTitle,int age) {
	this.Height = Height;
	this.Name = Name;
	this.ShoeSize = ShoeSize;
	this.JobTitle = JobTitle;
	this.age = age;
}

	//Non Static Greet
public void Greet() {
	System.out.println("Name:"+ Name+" Height:" +Height + " Shoe Size:" + ShoeSize +" Job Title:"+ JobTitle + " Age:" +  age);
}

}