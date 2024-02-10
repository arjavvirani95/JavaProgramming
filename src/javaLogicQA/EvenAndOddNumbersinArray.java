package javaLogicQA;

public class EvenAndOddNumbersinArray {

	public static void main(String[] args) {
		
		int a[]={10,20,15,3,6,7,8,2,5,7,10,58,95,96,16,57,98,21,20,64,58,97,93,49};
		
		int n = a.length;
		System.out.print("Odd number: ");
		for(int i = 0; i < n; i++) {
			
			if(a[i] % 2 != 0) {
				System.out.print(a[i]+ " ");
			}
		}
		
		System.out.println();
		System.out.print("Even number: ");
		
		for(int j = 0; j < n; j++) {
			if(a[j] % 2 == 0) {
				System.out.print(a[j] + " ");
			}
		}
		

	}

}
