package practiceJava;

public class CountCharOccurance {

	public static void main(String[] args) {
		
		
		char fchar = 'n';
		String s = "arjav virani";
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == fchar) {
				count++;
			}
		}
		System.out.println(count);
	}
}
