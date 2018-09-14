package mycode;

public class EqualTest {

	 public static void main(String [] args) {
		 String str1 = new String("ABCD");
		 String str2 = new String("ABCD");
		 
		 if (str1 == str2) {
			 System.out.println("str1 == str2 is true");
		 }
		 else {
			 System.out.println("str1 == str2 is false");
		 }
		 
		 if (str1.equals(str2)) {
			 System.out.println("str1.equals(str2)  is true");
		 }
		 else {
			 System.out.println("str1.equals(str2) is false");
		 }
		 
		 String str3 = str2;
		 if (str2 == str3) {
			 System.out.println("str2 == str3 is true");
		 }
		 else {
			 System.out.println("str2 == str3 is false");
		 }
		 
		 if (str2.equals(str3)) {
			 System.out.println("str2.equals(str3)  is true");
		 }
		 else {
			 System.out.println("str2.equals(str3) is false");
		 }
				 
	 }
	 
}
