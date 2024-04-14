package practiceJava;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//first way
		String s = "jane";
		String rev = "";
		
		System.out.println(s.length()); // 4
		
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		//Second way ok
		String originalStr = "Arjav";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
	}
}
