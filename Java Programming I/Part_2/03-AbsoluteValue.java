
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int modulus = Integer.valueOf(scanner.nextLine());

        if (modulus < 0) {
            modulus = modulus * -1;
            System.out.println(modulus);
        } else {
            System.out.println(modulus);
        }
    }
}
