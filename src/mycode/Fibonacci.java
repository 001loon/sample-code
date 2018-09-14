package mycode;

public class Fibonacci {


	public static void main (String [] args) {
	    String arg = "5";
//		if (args != null && args.length > 0) {
			int fibposition = Integer.parseInt(arg);
            
			int calculatedFib = fibNumCalculator(fibposition);
			System.out.println("the fibonacci number is ::" + calculatedFib);
	//	}
	//	else {
	//		System.out.println("the fibonacci number cannot be calculated");
	//	}
	}

	public static int fibNumCalculator(int x) {

		int prev = 0;
		int current = 1;
		int fibNum = 0;

		if (x == 0 || x == 1) {
			return x;
		}

		for (int y = 1; y < x; y++) {
			System.out.println("prev = " + prev);
			System.out.println("current = " + current);
			fibNum = prev + current;
			prev = current;
			current = fibNum;
			System.out.println("fibNum = " + fibNum);
			System.out.println("-------------------");
		}
		return fibNum;
	}

}
