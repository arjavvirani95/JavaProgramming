package day11_Java_Inheritance_OverRiding_SuperKey;


class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}

	void m2(int b)
	{
		System.out.println(b);
	}
}


class XYZ extends ABC
{
	@Override
	void m1(int a)   // overrided method
	{
		System.out.println(a*a);
	}

	void m2(int a, int b)  // overloaded method
	{
		System.out.println(a+b);
	}

}

public class OverridingVsOverLoading {

	public static void main(String[] args) {

		XYZ xyz=new XYZ();
		//Override method will be called
		xyz.m1(3);
		//One argument m2 method will be call
		xyz.m2(10);
		xyz.m2(10,20);



	}

}
