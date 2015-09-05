import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program to check whether a point is inside or outside of the figure below.
 * The point is given as a pair of floating-point numbers, separated by a space.
 * Your program should print "Inside" or "Outside".
 */
public class PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] points = input.split(" ");

        double firstPoint = Double.parseDouble(points[0]);
        double secondPoint = Double.parseDouble(points[1]);

        boolean firstFigure = (firstPoint < 12.5 || firstPoint > 22.5) && (secondPoint < 6 || secondPoint > 8.5);

        boolean secondFigure = (firstPoint < 12.5 || firstPoint > 17.5) && (secondPoint < 8.5 || secondPoint > 13.5);

        boolean thirdFigure = (firstPoint < 20 || firstPoint > 22.5) && (secondPoint < 8.5 || secondPoint > 13.5);

        if (firstFigure || secondFigure || thirdFigure) {
            System.out.print("Outside");
        }

        else {
            System.out.print("Inside");
        }
        
        }
    }
