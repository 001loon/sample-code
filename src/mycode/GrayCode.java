package mycode;

import java.math.BigInteger;

public class GrayCode {

	public static void main(String [] args) {
		int arg1 = 40;
		int arg2 = 40;
		
		if (args != null && args.length > 0) {
		 arg1 = Integer.parseInt(args[0]);
		 arg2 = Integer.parseInt(args[1]);
		}
		
		boolean gray = isItGray(arg1, arg2);
		boolean grayXOR = isItGrayXOR(arg1, arg2);
		System.out.println("Gray?  " + gray);
		System.out.println("XORGray?  " + grayXOR);
	}
	
	public static boolean isItGray(int x, int y) {
		boolean result = true;
		String g1 = String.format("%016d", new BigInteger(Integer.toBinaryString(x)));
		String g2 = String.format("%016d", new BigInteger(Integer.toBinaryString(y)));
		int counter = 0;
		System.out.println("binary g1 = " + g1);
		System.out.println("binary g2 = " + g2);

			int i = g1.length();
			
			char [] g1Temp = g1.toCharArray();
			char [] g2Temp = g2.toCharArray();
			for (int q=0; q < i; q++) {
				if (g1Temp[q] != g2Temp[q]) {
					counter++;
				}
			}

		if (counter > 1) {
			result = false;
		}
		return result;
	}
	
	public static boolean isItGrayXOR(int x, int y) {
	   boolean result = true;
	   
	   int a = x ^ y;
	   while (a > 0){
		   if (a % 2 == 1 && a>>1 > 0) {
			   result = false;
			   break;
		   }
		   a = a>>1;
	   }
	   return result;
	}
}
