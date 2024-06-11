package practiceJava;

public class StringOperations {

	public static void main(String[] args) {

		//String is collection of character!
		
		String name = "Arjav"; //it is just variable
		String lname = new String(" Virani"); //its object of String class
		
		//Various methos we can do with this String
		
		//length()
		System.out.println(name.length()); //give length of name variable
		
		//concat(), "+" operator
		System.out.println(name.concat(lname)); //join the name and last name
		System.out.println(name+lname);
		
		//trim() remove blank space from string
		String strim = "   Marvel       ";
		System.out.println(strim.length());
		System.out.println(strim.trim());
		System.out.println(strim.trim().length());
		
		
		//charAt() return the index of each character
		String s1 = "Java";
		System.out.println(s1.charAt(1)); // e
		
		//check and print boolean value if character is present or not
		System.out.println(s1.contains("co")); // true
		System.out.println(s1.contains("ar")); // false
		
		
		//validate if 2 String is equal or not
		String s2 = "WELCOME";
		System.out.println(s1.equals(s2)); // false
		
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		
	}

}
