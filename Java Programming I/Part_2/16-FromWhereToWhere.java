
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int userInput = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? ");
        int userInput2 = Integer.valueOf(scanner.nextLine());
    
        while (userInput2 <= userInput) {
            System.out.println(userInput2);
            userInput2++;

        }
        // Write your program here
    }
}
