package javaProgrammingExamples;

public class IntegerToStringConvesion {

	public static void main(String[] args) {
		// Convert Integer To String Using Integer.toString() Method Autoboxing
			int i = 2015;
	         
	        String s = Integer.toString(i);
	         
	        System.out.println(s); 
	  
	        //Convert Integer To String Using String.valueOf() method Unboxing
	        s = String.valueOf(i);
	         
	        System.out.println(s);  
	        
	}

}
