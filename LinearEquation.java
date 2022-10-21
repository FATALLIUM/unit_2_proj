

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

    // find distance between two points rounded to the nearest hundredth
    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }

    // find the y-intercept rounded to the nearest hundredth
    public double yIntercept() {
        return roundedToHundredth(y1-x1*slope());

    }

    // find the slope rounded to the nearest hundredth
    public double slope() {
        return roundedToHundredth((double) (y2-y1)/(x2-x1));
    }

    // finding the greatest common denominator
    public int gcd(int a, int b) {
        int gcd = 1;    // initialize gcd
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) { // see if i is a factor of var a & var b
                gcd = i;    // initialize i to gcd
            }
        }
        return gcd;
    }


    // changing decimals into fraction for y = mx + b
    // does not work for repeating decimals such as 1/7
    public String decimalToFraction() {
        if (slope()== 0) {  // if there is no slope, return y-intercept
            return "" + yIntercept();
        }

        // initialize numerator and denominator
        int num = (int) (slope() * 100);
        int denom = 100;
        int gcd = gcd(num, denom);  // get gcd of the numerator and denominator

        num = num/gcd;  // simplify num and denom if possible
        denom = denom/gcd;

        // if slope is a whole number...
        if (num % denom == 0) {
            if (num / denom == -1) {
                return "-";
            }
            if (num / denom == 1) {
                return "";
            } else {
                return "" + num / denom;
            }
        }
        // if slope is not a whole number...
        return num + "/" + denom;
    }

    // print equation
    public String equation() {
        if (y2 == y1) {     // if there is no slope, return just the -intercept
            return "y = " + y2;
        }

        if (yIntercept() == 0) {    // if there is no y-intercept, return slope
            return "y = " + decimalToFraction() + "x";
        }

        // if slope is negative or not...
        if (String.valueOf(yIntercept()).charAt(0) == '-') {
            return "y = " + decimalToFraction() + "x " + yIntercept();
        }
        else {
            return "y = " + decimalToFraction() + "x + " + yIntercept();
        }
    }

    // finding the value of y given x
    public String coordinateForX(double xValue) {
        double yValue = roundedToHundredth(slope()*xValue + yIntercept());
        return "(" + xValue + ", " + yValue + ")";
    }

    // rounding
    public double roundedToHundredth(double toRound) {
        return (double) Math.round(toRound * 100)/100;
    }

    // printing all the info
    public String lineInfo() {
        return "The two points are: " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")" +
                "\nThe equation of the line between these two points is: " + equation()
                + "\nThe slope of this line is: "
                + slope() + "\nThe y-intercept is: " + yIntercept() + "\nThe distance between the two points" +
                " is: " + distance() + "\n";
        }
}
