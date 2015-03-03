package com.javaprograms.javaInheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
//		Guitar myGuitar = new Guitar();
//		myGuitar.setName("Gibson");
//		
//		System.out.println(myGuitar.getName());
		
		//we are creating an instance of the bass guitar
		//In this case we can create as many basses as we want and we can set values and output them
		//all we had to do was to extend the guitar parent class in order for this to work.
		Bass bass = new Bass();
		
		bass.setName("Bass");
		bass.setNumStrings(4);
		bass.setSerialNum(1478);
		
		System.out.println(bass.getName() + ", " + bass.getNumStrings() + ", " + bass.getSerialNum());
		
		Classical classicalGuitar = new Classical();
		Electric electricGuitar = new Electric();
		//Calling overridden functions/methods
		//we are overriding our parent play.
		classicalGuitar.play();
		classicalGuitar.sound();
		
		electricGuitar.play();
		electricGuitar.sound();

		bass.play();
		bass.sound();
	}

}
