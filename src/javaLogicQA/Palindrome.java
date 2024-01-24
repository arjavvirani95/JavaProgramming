package javaLogicQA;

public class Palindrome {

	public static void main(String[] args) {
	
		int number = 51515;
		int sum = 0;
		int ld,a;
		a=number;
		
		while(a > 0) {
			ld = a%10; //will get last digit 5 
			sum = (sum*10)+ld; //will add number in sum(creating reverse num)
			a = a/10; //will remove last digit
			
		}
		if(sum == number) {
			System.out.println("number is palidrom "+ sum);
		}
	}

}
