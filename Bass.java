package com.javaprograms.javaInheritance;

//if we want this class to inherit from the guitar class we use the "extend" key word
public class Bass extends Guitar {
	
	public Bass() {	
		//super gets the parent constructor first
		super();
		System.out.println("Bass Constructor");
	}
	
	public void play(){
		System.out.println("BOOOOOOOOOOMMMMMMMMMMMMMM");
	}
	
	public void sound(){
		System.out.println("Bass guitar is the best");
	}

}
