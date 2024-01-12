package day1;

public class FirstJavaProgram 
{

	public static void main(String args[])
	{
	
		System.out.println("welcome to java programming");
		System.out.println(10+20);
		
		String s1 = null;
		System.out.println(s1); // line 2
		//System.out.println(s1.toString()); // line 3 ans: can not convert string to string
		// o/p null NullPointerExpception
		System.out.println("----------");
		
		String a1 = "abd";
		StringBuffer a2 = new StringBuffer(a1);
		System.out.println(a1.equals(a2));
		// o/p false
		
	}
	
}
