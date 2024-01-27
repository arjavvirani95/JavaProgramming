package javaLogicQA;

import java.util.Random;

public class GeneratingRandomNumbers {

	 public static void main(String[] args)
	    {
		 
		 //Appraoch1: Generating Random Numbers Using java.util.Random Class
	       
		 	Random random = new Random();
		 	
		 	for(int i = 0; i < 10; i++) {
		 		int num8 = random.nextInt(90000000) + 10000000;
			 	System.out.println(num8);
			 	
			 	//Need third party library => org.apache.commons-lang3
			 	//String generate_email=org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric(5);
		 	}
		 	
	 
	    }
	 
}
