package day9_Java_Constructor_Method;


//5) Polymorphism(O
//- One thing have many forms.
//- polymorphism can achive using overloading(Run time Polymorphism) concept
//
//=> 4 rules are applicable in overloading
//1) Method names should be same.                 Method()
//2) number of parameters should be different.    Method(int a, int b)
//3) Data type of parameters should be different. Method(int a, double b)
//4) Order of parameters should be different.     Method(double b,int a)


public class MethodOverloading {

	int x,y,z;
	double d;
 
	void sum()   //1
	{
		x=10;
		y=20;
		System.out.println(x+y);
	} 

	void sum(int a, int b)   //2
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}

	void sum(int a, double b)  //3
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}

	void sum(double b,int a)   //4
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
 
	public static void main(String[] args) {

		MethodOverloading  mo=new MethodOverloading(); 
		mo.sum(); //1

		mo.sum(100,200); //2

		mo.sum(10.5, 10);  //4

		mo.sum(10, 20.5);  //3 

	} 
}
