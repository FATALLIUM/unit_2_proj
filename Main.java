import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Start
        System.out.println("Welcome.\nEnter coord 1: ");
        String coord1 = scan.nextLine();

        System.out.println("Enter coord 2: ");
        String coord2 = scan.nextLine();

        int x1;
        int x2;
        int y1;
        int y2;

        // getting rid of parentheses
        for (int i = 0; i < coord1.length(); i++) {
            coord1 = coord1.replace("(", "");
            coord1 = coord1.replace(")","");
            coord1 = coord1.replace(" ", "");
            }

        for (int e = 0; e < coord2.length(); e++) {
            coord2 = coord2.replace("(", "");
            coord2 = coord2.replace(")","");
            coord2 = coord2.replace(" ", "");
        }

        // splitting the coords into x and y in array
        String[] splitCoord1 = coord1.split(",");
        String[] splitCoord2 = coord2.split(",");

        x1 = Integer.parseInt(splitCoord1[0]);
        x2 = Integer.parseInt(splitCoord2[0]);

        y1 = Integer.parseInt(splitCoord1[1]);;
        y2 = Integer.parseInt(splitCoord2[1]);



        // run code here
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));

    }
}