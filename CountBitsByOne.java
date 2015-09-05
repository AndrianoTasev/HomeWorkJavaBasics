import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program to calculate the count of bits 1 in the binary representation of given integer number n.
 */
public class CountBitsByOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.next());

        String binaryOfNumber = Integer.toBinaryString(number);

        System.out.println(binaryOfNumber);

        System.out.println(Integer.bitCount(number));


    }
}
