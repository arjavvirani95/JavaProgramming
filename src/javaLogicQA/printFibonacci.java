package javaLogicQA;

public class printFibonacci {

	public static void main(String[] args) {
		// Print Fibonacci series i.e 0,1,1,2,3,5,8,13,21
		
		int n = 10; //upto what number
		int series = 0; //third variable
		int i = 0; //first number
		int j = 1; //second number
		int k = 0; //counter
		while(k<10) {
			System.out.print(i+" "); //print number
			series = i+j;
			i=j;
			j=series;
			k++;
		}
		
		
	}

}
