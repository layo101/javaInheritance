package com.javaprograms.javaInheritance;

public class Classical extends Guitar{

	public Classical(){
		System.out.println("Hello from Classical Constructor");
	}
	//overriding functions
	//We can create our own functions inside the subclass that overrides the methods
	//that are being inherited from the parent class
	
	public void sound(){
		System.out.println("Classical Sound is playing");
	}
	
	public void play(){
		System.out.println("lalalalala");
	}
}
