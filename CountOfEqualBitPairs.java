import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 * Write a program to count how many sequences of two equal bits ("00" or "11")
 * can be found in the binary representation of given integer number n (with overlapping).
 */
public class CountOfEqualBitPairs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.next());

        char[] binary = Integer.toBinaryString(number).toCharArray();

        int count = 0;

        for (int i = 0; i < binary.length-1; i++) {
            if (binary[i]==binary[i+1]) {
                count++;
            }
        }
        System.out.println("Equal bits: ");
        System.out.print(count);
    }
}
