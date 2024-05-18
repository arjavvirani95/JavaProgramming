package practiceJava;

import java.util.HashMap;

public class DuplicateCounter1 {

	public static void main(String[] args) {
		
		String[] s = {"000", "123", "000", "234", "234", "111"};
		 
		HashMap<String, Integer> countmap = new HashMap<>();
		
		for(String s1 : s) {
			
			if(countmap.containsKey(s1)) {
				countmap.put(s1, countmap.get(s1)+1);
			}else {
				countmap.put(s1, 1);
			}
			
		}
		
		// Print the duplicate values and their counts
        for (String key : countmap.keySet()) { 
        	int count = countmap.get(key);
        	System.out.println(countmap.get(key));
        }
		
	}

}
