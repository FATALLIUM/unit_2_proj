public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }


    public double yIntercept() {
        return roundedToHundredth(y1-x1*slope());

    }


    public double slope() {
        return roundedToHundredth((double) (y2-y1)/(x2-x1));
    }


    public String equation() {
        String slope = "" + slope();
        String[] slope1 = slope.split("\\.");
        int numer = Integer.parseInt(slope1[0]) * 10 / 5;
        int denom = Integer.parseInt(slope1[1]) * 10 / 5; // fix this
        slope = numer + "/" +  denom;
        if (y2 == y1) {
            return "" + y2;
        }
        if (yIntercept() == 0) {
            return "y = " + slope + "x";
        }
        if (yIntercept() != -yIntercept()) {
            return "y = " + slope + "x + " + yIntercept();
        }
        return "y = " + slope + "x ";
    }


    public String coordinateForX(double xValue) {
        double yValue = roundedToHundredth(slope()*xValue + yIntercept());
        return "(" + xValue + ", " + yValue + ")";
    }


    public double roundedToHundredth(double toRound) {
        return (double) Math.round(toRound * 100)/100;
    }


    public String lineInfo() {
        return "The two points are: " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")" +
                "\nThe equation of the line between these two points is: " + equation()
                + "\nThe slope of this line is: "
                + slope() + "\nThe y-intercept is: " + yIntercept() + "\nThe distance between the two points" +
                " is: " + distance() + "\n";
        }
}
