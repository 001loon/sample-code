package mycode;

public class Swap {
	public static void main (String [] args) {
		String arg1 = args[0];
		String arg2 = args[1];
		
		System.out.println("starting arg 1 = " + arg1);
		System.out.println("starting arg 2 = " + arg2);
		
		int oneStart = Integer.parseInt(arg1);
		int twoStart = Integer.parseInt(arg2);
		System.out.println("starting arg 1 as int = " + oneStart);
		System.out.println("starting arg 2 as int = " + twoStart);		
		
		swapit(oneStart,twoStart);
	}
	
	public static void swapit(int a, int b) {
		a = a + b;
		b = b - a;
		a = a + b;
		b = b + a;
		
		System.out.println("ending arg 1 = " + a);
		System.out.println("ending arg 2 = " + b);
	}
}
