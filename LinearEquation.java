import javax.management.StringValueExp;

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


    public int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }



    public String decimalToFraction() {
        String slope = "" + slope();
        String[] intFrac = slope.split("\\.");

        int num = Integer.parseInt(intFrac[0]) * 100 + Integer.parseInt(intFrac[1]);
        int denom = 100;

        int gcd = gcd(num, denom);

        num = num/gcd;
        denom = denom/gcd;

        if (num % denom == 0) {
            return "" + num/denom;
        }

        return num + "/" + denom;
    }


    public String equation() {
        if (y2 == y1) {
            return "y = " + y2;
        }
        if (slope() == 0 || slope() == 1) {
        } if (yIntercept() == 0) {
            return "y = " + "x ";
        }

        if (yIntercept() == 0) {
            return "y = " + decimalToFraction() + "x";
        }
        if (String.valueOf(yIntercept()).charAt(0) == '-') {
            return "y = " + decimalToFraction() + "x " + yIntercept();
        }
        else {
            return "y = " + decimalToFraction() + "x + " + yIntercept();
        }
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
