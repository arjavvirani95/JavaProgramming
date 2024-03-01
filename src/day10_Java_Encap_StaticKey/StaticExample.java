package day10_Java_Encap_StaticKey;

//1) static methods can access static stuff directly ( without object).
//2) static methods can access non-static stuff through object
//3) non-static methods can access everything directly.

//Static method uses complie time binding or early binding. 
//Non-static method uses run time binding or dynamic binding. 
//A static method cannot be overridden being compile time binding. 
//A non-static method can be overridden being dynamic binding.

public class StaticExample {

	static int a=10;   // static variable
	int b=20;  // non-static variable


	static void m1()   // static method
	{
		System.out.println("this is m1 static method");
	}

	void m2()   // non-static method
	{
		System.out.println("this is m2 non-static method");
	}


	void m()   // non-static method
	{
		System.out.println(a);
		System.out.println(b);

		m1();
		m2();

	}  

}
