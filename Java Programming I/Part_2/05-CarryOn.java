
import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //loop continues until user enters "no"
        while(true) {
            System.out.println("Shall we carry on?");
            System.out.println("");
            String keepGoing = scanner.nextLine();
            if (keepGoing.equals("no")){
                break;
            }
        }
    }
}
