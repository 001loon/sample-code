package mycode;

public class Line {
    private static double epsilon = 0.00001;
    private double slope;
    private double yIntercept;

    public Line(double slope, double yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public boolean intersect(Line line) {
    	//2 identical lines
        if (this.equals(line)) return true;
        // slopes are not the same ( differ by at least .00001)
        if (Math.abs(slope - line.slope) > epsilon) return true;
        //all other cases do not intersect
        return false;
    }

    @Override
    public boolean equals(Object o) {
    	//if the object  is not a line then not equal
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        //slope of line a - slope of line b < .00001 AND
        //intercept of line a - intercept of line b < .00001
        //then lines are the same and 2 identical lines are considered to intersect
        return Math.abs(slope - line.slope) < epsilon &&
               Math.abs(yIntercept - line.yIntercept) < epsilon;
    }
}