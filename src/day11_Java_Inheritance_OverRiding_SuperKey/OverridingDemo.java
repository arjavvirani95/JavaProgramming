package day11_Java_Inheritance_OverRiding_SuperKey;

class Bank
{
	double roi()
	{
		return 0.0;
	}
}


class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class AXIS extends Bank
{
	double roi()
	{
		return 9.75;
	}
}



public class OverridingDemo {

	public static void main(String[] args) {
		
		ICICI ic=new ICICI();
		System.out.println(ic.roi()); //10.5
		
		
		AXIS ax=new AXIS();
		System.out.println(ax.roi()); //11.5
		
		Bank bn=new Bank();
		System.out.println(bn.roi()); //0.0
					
		
	}

}
