package day11_Java_Inheritance_OverRiding_SuperKey;

public class TestSuper {

	public static void main(String[] args) 
	{
		
		Dog d=new Dog(); //Derived class object 
		d.displayColor(); //Derived class method calling
		Animal a= new Animal();
		a.eat(); //Base Class object method called
		d.eat(); //derived class method calling
		
	}

}
