
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int userInput = Integer.valueOf(scanner.nextLine());

        int factorial = 1;
        int count = 0;
        while(count < userInput) {

            count++;
            factorial *= count;       //short hand for factorial = factorial * count
        }
        System.out.println("Factorial: " + factorial);
    }
}
