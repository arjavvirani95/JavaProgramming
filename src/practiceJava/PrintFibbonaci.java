package practiceJava;

public class PrintFibbonaci {

	public static void main(String[] args) {
		
		int n = 19;
		int t1 = 0;
		int t2 = 1;
		
		for(int i=1; i<=n; i++) {
		
			System.out.print(t1 + " "); //print 0 1 1 2 3 5  8  13 21
			int sum = t1 + t2;          //sum   1 2 3 5 8 13 21 34 45
			t1 = t2;                    //t1    1 1 2 3 5 8  13 21 34
			t2 = sum;                   //t2    1 2 3 5 8 13 21 34 45 
		}
	}
}
