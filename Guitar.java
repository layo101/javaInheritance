package com.javaprograms.javaInheritance;

//Parent Class
public class Guitar {
	
	private String name;
	private int serialNum;
	private int numStrings;
	
	public Guitar(){
		System.out.println("Parent Constructor");
	}
	
	//play
	public void play(){
		System.out.println("Dum Dum Dum");
	}
	
	//sound
	public void sound(){
		System.out.println("Playing a sweet sound");
	}
	
	
	//this keyword in Java is very contextual, it refers to anything inside the class
	//we are referencing
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	
	
}
