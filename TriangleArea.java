import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program that enters 3 points in the plane (as integer x and y coordinates),
 * calculates and prints the area of the triangle composed by these 3 points.
 * Round the result to a whole number. In case the three points do not form a triangle,
 * print "0" as result.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firsLineInput = scanner.nextLine();
        String secondLineInput = scanner.nextLine();
        String thirdLineInput = scanner.nextLine();

        String[] firstNumbers = firsLineInput.split(" ");
        String[] secondNumbers = secondLineInput.split(" ");
        String[] thirdNumbers = thirdLineInput.split(" ");

        int aX = Integer.parseInt(firstNumbers[0]);
        int aY = Integer.parseInt(firstNumbers[1]);

        int bX = Integer.parseInt(secondNumbers[0]);
        int bY = Integer.parseInt(secondNumbers[1]);

        int cX = Integer.parseInt(thirdNumbers[0]);
        int cY = Integer.parseInt(thirdNumbers[1]);

        int sideA = cX - aX;
        int sideB = bY - cY;
        int sideC = bY - aY;

        if ((sideA + sideB) > sideC){
            int area = Math.abs(((aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY))/2));
            System.out.print(area);
        }

        else {
            System.out.print(0);
        }
    }
}
