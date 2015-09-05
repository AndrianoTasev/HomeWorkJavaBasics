import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program that enters a positive integer number num
 * and converts and prints it in hexadecimal form.
 * You may use some built-in method from the standard Java libraries
 */
public class DecimalToHexadecimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.next());

        String hex = Integer.toHexString(num);

        System.out.print("Hexadeciam value is: " + hex.toUpperCase());

    }
}
