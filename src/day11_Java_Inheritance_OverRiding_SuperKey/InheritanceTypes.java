package day11_Java_Inheritance_OverRiding_SuperKey;

class A
{
	String a;

	void display()
	{
		System.out.println(a);
	}
}


class B extends A
{
	String b;

	void show()
	{
		System.out.println(b);
	}

}

class C extends B
{
	String c;

	void print()
	{
		System.out.println(c);
	}

} 

public class InheritanceTypes {

	public static void main(String[] args) {

		B bobj=new B();

		bobj.a="Class A Value by Class B Object";
		bobj.b="Class B Value by Class B Object";

		bobj.display();
		bobj.show();


		/*C cobj=new C();

		cobj.a="Class A Value by Class C Object";
		cobj.b="Class B Value by Class C Object";
		cobj.c="Class C Value by Class C Object";

		cobj.display();
		cobj.show();
		cobj.print();*/
	}

}










