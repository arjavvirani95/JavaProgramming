package javaLogicQA;

public class printFibonacci {

	public static void main(String[] args) {
		// Print Fibonacci series i.e 0,1,1,2,3,5,8,13,21
		
		int n = 10;
		int series = 0;
		int i = 0;
		int j = 1;
		int k = 0;
		while(k<10) {
			System.out.print(i+" ");
			series = i+j;
			i=j;
			j=series;
			k++;
		}
		
		
	}

}
