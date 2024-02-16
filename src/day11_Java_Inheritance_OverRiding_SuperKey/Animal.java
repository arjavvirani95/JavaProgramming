package day11_Java_Inheritance_OverRiding_SuperKey;

public class Animal {

	String color="white";
	
	void eat()
	{
		System.out.println("eating.....");
	}
	
}
 
class Dog extends Animal
{
	String color="black";
	
	
	void displayColor()
	{
		System.out.println(super.color); //parent class variable calling
	}
	
	void eat()
	{
		System.out.println("eating bread");
		super.eat();
	}
}