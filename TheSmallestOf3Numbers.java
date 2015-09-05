import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program that finds the smallest of three numbers.
 */
public class TheSmallestOf3Numbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.next());

        double b = Double.parseDouble(scanner.next());

        double c = Double.parseDouble(scanner.next());

        if (a <= b && a <= c){
            System.out.print(a);
        }

        else if ( b <= a && b <= c){
            System.out.print(b);
        }

        else if (c <= a && c <= b){
            System.out.print(c);
        }
    }
}
