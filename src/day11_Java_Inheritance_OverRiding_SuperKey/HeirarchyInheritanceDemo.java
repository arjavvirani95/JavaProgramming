package day11_Java_Inheritance_OverRiding_SuperKey;


// two child class extending one parent class
class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}


class Child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}


class Child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}


public class HeirarchyInheritanceDemo {

	public static void main(String[] args) {

		Child1 c1=new Child1(); //creating 1st child class object
		c1.display(100); //parent extended into 1st child class, calling parent class method through child class object
		c1.show(200);

		Child2 c2=new Child2();
		c2.display(10);
		c2.print(20);

	}

}
