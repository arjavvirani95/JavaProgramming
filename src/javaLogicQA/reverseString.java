package javaLogicQA;

import java.util.Objects;

public class reverseString {

	public static void main(String[] args) {
		// reverse stirng "arjav"
		String s = "mam mam";
		String t = "";
		System.out.println(s.length());

		for(int i = s.length()-1; i>=0; i--) {
			//System.out.println(s.charAt(i));
			t = t + s.charAt(i);
		}

		System.out.println(t);

		if(Objects.equals(t, s)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}

	}

}
