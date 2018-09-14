package mycode;

public class Line2 {
	public static int intersectionPoint;
	
	public static void main (String[]args) {
				
		Line a = new Line(0,4);
		Line b = new Line(1,2);
		
		if (a.intersect(b)) {
			System.out.println("yes line a intersects line b");
		}
		else {
			System.out.println("no line a does NOT intersect line b");
		}
		
	}
	
}