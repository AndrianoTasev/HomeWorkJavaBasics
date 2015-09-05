import java.util.Scanner;

/**
 * Created by Andriano on 5.9.2015 ã..
 */
public class RecntangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        int firstNumber = Integer.parseInt(numbers[0]);
        int secondNumber = Integer.parseInt(numbers[1]);

        System.out.print(firstNumber * secondNumber);
    }
}
