package com.acharya.inheritance;

class Animal1
    {
	  void eat()
	  {
		  System.out.println("Eating....");
	  }
    }
class Dog1 extends Animal1
    {
	    void Bark()
	    {
	    	System.out.println("Braking....");
	    }
    }
class Babydog extends Dog1
    {
	    void whines()
	    {
	    	System.out.println("whining....");
	    }
    }
public class Multi_level {

	public static void main(String[] args) {
		 Animal1 a=new Animal1 ();
		 Animal1 a1=new Dog1();
		 Animal1 a2=new Babydog();
         Dog1 d=new Dog1();
         Dog1 d1=new Babydog();
         Babydog b=new Babydog();
         a.eat();
         a1.eat();
         a2.eat();
         d.Bark();
         d1.Bark();
         b.whines();
	}

}
