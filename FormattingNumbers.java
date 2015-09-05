import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program that reads 3 numbers: an integer a (0 ? a ? 500),
 * a floating-point b and a floating-point c and prints them in 4 virtual columns on the console.
 * Each column should have a width of 10 characters.
 * The number a should be printed in hexadecimal,
 * left aligned; then the number a should be printed in binary form,
 * padded with zeroes, then the number b should be printed with 2 digits after the decimal point,
 * right aligned; the number c should be printed with 3 digits after the decimal point,
 * left aligned.
 */
public class FormattingNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());

        double b = Double.parseDouble(scanner.next());

        double c = Double.parseDouble(scanner.next());

        String str = Integer.toBinaryString(a);

        if (a >= 0 && a <= 500){

            //String hex = Integer.toHexString(a);
            //String binary = Integer.toBinaryString(a);

            System.out.print(String.format("|%-10s|%010d|%10.2f|%-10.3f|", Integer.toHexString(a).toUpperCase(), Integer.parseInt(str), b, c));

        }
        else {
            System.out.print("The integer a must be (0<=a<=500)");
        }
    }
}
