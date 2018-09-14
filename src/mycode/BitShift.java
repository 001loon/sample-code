package mycode;

public class BitShift {
	public static int BITS_IN_INT = 32;
	public static void main(String [] args) {
		int originalInput = Integer.parseInt("24000");
		int shift = 17;
	
		if (args != null && args.length > 0) {
			 originalInput = Integer.parseInt(args[0]);
			 shift = Integer.parseInt(args[1]);
		}
				
		System.out.println("original integer = " + String.format("0x%08X",originalInput) + " shifted by = " + 
		shift + " result = " + String.format("0x%08X", (shiftIt(originalInput, shift))));
		
	}
	
	public static int shiftIt(int x, int y) {
	
		System.out.println("original integer = " + String.format("0x%08X",x));
		if (y < 0) {
			System.out.println("using abs y");
			int absoluteY = Math.abs(y);
			System.out.println("absoluteY = " + absoluteY);
			System.out.println("part 1 = " + String.format("0x%08X", (x << absoluteY)));
			System.out.println("part 2 = " + String.format("0x%08X", (x >> (BITS_IN_INT - absoluteY))));
			return (x << absoluteY | x >> (BITS_IN_INT - absoluteY));
		}
		else {
			System.out.println("using regular y");
			System.out.println("part 1 = " + String.format("0x%08X", (x >> y)));
			System.out.println("part 2 = " + String.format("0x%08X", (x << (BITS_IN_INT - y))));
			return (x >> y | x << (BITS_IN_INT - y));
		}
	}
}
