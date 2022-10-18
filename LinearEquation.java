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


    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".

        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7

        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!


        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0   - 2.35       + 12.5      - 8.0     + 17.19


        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation() {

        return  "w";
    }


    public String coordinateForX(double xValue) {
        double yValue = slope()*xValue + yIntercept();
        return "(" + xValue + ", " + yValue + ")";
    }


    public double roundedToHundredth(double toRound) {
        return (double) Math.round(toRound * 100)/100;
    }



       /* Returns a string that includes all information about the linear equation, each on
          separate lines:
            - The original points: (x1, y1) and (x2, y2)
            - The equation of the line in y = mx + b format (using equation() method)
            - The slope of the line, as a decimal (using slope() method)
            - The y-intercept of the line (using yIntercept() method)
            - The distance between the two points (using distance() method)

         This method should call all other appropriate methods to get the info it needs:
         equation(), slope(), yIntercept(), distance().

         */
        public String lineInfo() {
            return "3";
        }
}
