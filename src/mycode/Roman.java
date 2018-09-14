package mycode;

public class Roman {
	private static final String[] numerals = 
		    new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", 
		                 "V", "IV", "I"};
		private static final int[] values =
		    new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
	public static void main (String [] args) {
		String arg1 = args[0];
		
		int romanAsInt = Integer.parseInt(arg1);
		
		System.out.println("convert this number to roman numeral  = " + romanAsInt);		
		
		String romanNumeral = romanCalc(romanAsInt);
		System.out.println("roman numeral  = " + romanNumeral);
	}
	
	public static String romanCalc(int value) {
				
		    // We are only considering the range for standard roman numerals
		    if (value > 3999 || value < 1) throw new IllegalArgumentException();
		    
		    StringBuilder numeral = new StringBuilder();
		    int i = 0;
		    // Greedily append the largest numeral possible until the value is 0
		    while (value > 0) {
		        if (value - values[i] >= 0) {
		            numeral.append(numerals[i]);
		            value -= values[i];
		        } else {
		            i++;
		        }
		    }
		    return numeral.toString();		
	}
}

