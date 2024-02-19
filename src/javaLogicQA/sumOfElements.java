package javaLogicQA;

public class sumOfElements {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,9,10,12,56,548,98,63,78};

		int sum = sumArray(a);
		System.out.println(sum);
	}

	public static int sumArray(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length;i++) { 
			sum = sum + a[i];
			
		}
		return sum;
	}
	
	
}
