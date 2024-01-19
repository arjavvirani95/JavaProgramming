package day10_Java_Encap_StaticKey;

public class AccountMain {

	public static void main(String[] args) 
	{
		
	Account	accobj=new Account();
	
	accobj.setAcc_no(1234); //sending acc value to Account class with Account class object accobj.
	accobj.setName("John");
	accobj.setAmount(50000);
	
	System.out.println(accobj.getAcc_no()); //getting value of accno through object of class Account
	System.out.println(accobj.getName());
	System.out.println(accobj.getAmount());
	
	
	}

}
