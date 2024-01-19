package practiceJava;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "mam";
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
	}
}
