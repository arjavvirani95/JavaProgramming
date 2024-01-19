package day12_Java_Interface_FinalKey;


class Test1
{
	void m()
	{
		System.out.println("this is m from Test1 class...");
	}
}

class Test2 extends Test1    // incorrect, bcoz Test1 is final class
{
	@Override
	void m()   // incorrect, bcoz m() is final method
	{
		System.out.println("this is m from Test2 class...");
	}
}


public class FinalKeywordDemo2 {

	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t2.m();
		t1.m();
	}

}
