package mycode;

public class Factorial {
	public static void main (String [] args) {
		String arg1 = "5";
		
		if (args !=null && args.length > 0) {
			arg1 = args[0];
		}
		
		System.out.println("starting arg 1 = " + arg1);
		
		int factorialTest = Integer.parseInt(arg1);
		System.out.println("factorial of  " + factorialTest);		
		
		System.out.println("factorial value = " + factorial(factorialTest));
	}
	
	public static long factorial(int n) { 
		System.out.println("factorial of " + n);
	    if (n == 1) return 1; 
	    System.out.println("recursing to factorial using n-1 = " + (n-1));
	    return n * factorial(n-1); 
	} 
}
