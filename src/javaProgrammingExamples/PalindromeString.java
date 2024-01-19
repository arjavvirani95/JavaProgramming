package javaProgrammingExamples;

public class PalindromeString {
	
	public static void main(String[] args) {

		//For single word string 
		String s = "DAD";

		//1. using for loop 
		int len = s.length(); //7
		String rev = "";

		for(int i =len-1; i>=0; i--){
			rev = rev + s.charAt(i); //muineleS
		}

		System.out.println(rev);

		if(s.equals(rev))
		{
			System.out.println("Palindrome string");
		}
		else
		{
			System.out.println("Not Palindrome string");
		}

		//for long string splt word and find palindrome
		String inputString = "abba is mam";
		String[] words = inputString.split(" ");
	 
		for (String word : words) {

			if (isPalindrome(word)) {
				System.out.println(word);
			}

		}
		
		//2. using StringBuffer class:
			//StringBuffer sf = new StringBuffer(s);
		//System.out.println(sf.reverse());
	}

	private static boolean isPalindrome(String word) {
		int len = word.length();
		String rev = "";
		for(int i =len-1; i>=0; i--){
			rev = rev + word.charAt(i); //muineleS
		}
		if(word.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
		} 
	}


}