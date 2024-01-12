package day13_Java_Package_Midifier_WrapperClass.pack1;

import day13_Java_Package_Midifier_WrapperClass.Test;

/*public class TestMain extends Test
 {
 	public static void main(String[] args) {
		
		TestMain tm=new TestMain();
		System.out.println(tm.x);
		tm.m1();
		
	
	}
	
}*/
	
public class TestMain{

		public static void main(String[] args) {
						
			Test t=new Test();
			
			System.out.println(t.x);
			
			t.m1();
			
		}

}
