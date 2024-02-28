package day10_Java_Encap_StaticKey;

//wrapping up of data and methods in to single unit(class). 
//all variables should be private. 
//we can access variables only through methods(setters & getters)

public class Account {

	private int acc_no;
	private String name;
	private double amount;

	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) { //setting acc no which is coming from main class!
		this.acc_no = acc_no; //this keyword refers instance variable not local variable {}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}



}
