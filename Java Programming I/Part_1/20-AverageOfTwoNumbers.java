
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        double avg = 1.0*(firstNumber+secondNumber)/2;
        System.out.println("The average is "+avg);
    
    }
}
