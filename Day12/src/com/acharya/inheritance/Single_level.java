package com.acharya.inheritance;

class Animal
    {
	   void eat()
	   {
		   System.out.println("Eating...");
	   }
    }
class Dog extends Animal
    {
	  void brak()
	  {
		  System.out.println("Braking...");
	  }
    }
public class Single_level {

	public static void main(String[] args) {
		 Animal a=new Animal();
		 Animal a1=new Dog();
		 Dog d=new Dog();
		 a.eat();
		 a1.eat();
		 d.brak();
	}

}
