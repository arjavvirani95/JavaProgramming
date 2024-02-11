 package javaLogicQA;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		
		int array[]={10,100,20,50,5,60,1001,3};
		
		//Max value in array
		int max = array[0];
		
		for(int i=0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("Max number in array is " + max);
		
		// Min value in array
		int min = array[0];
		
		for(int j=0; j < array.length; j++) {
			if(array[j] < min) {
				min = array[j];
			}
		}
		 System.out.println("Min number in array is " + min);

	}

}
