package mycode;

public class Euclid {

    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else
            System.out.println("p= " + p + ", q= " + q + ", p%q = " + (p % q));
        	return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        int p = 1440;
        int q = 408;
        if (args != null && args.length > 0) {
         p = Integer.parseInt(args[0]);
         q = Integer.parseInt(args[1]);
        }
        
        int d  = gcd(p, q);
        int d2 = gcd2(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d);
        System.out.println("gcd(" + p + ", " + q + ") = " + d2);
    }
}