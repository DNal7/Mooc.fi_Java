
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int userInput = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int sum = 0;

        while (count < userInput) {
            count++;
            sum += count;           //sum = sum + count
            
        }
        System.out.println("The sum is " + sum);
    }
}
