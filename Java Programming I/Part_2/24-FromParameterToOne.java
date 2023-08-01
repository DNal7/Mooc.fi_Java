

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        int count = 0;              //could also use a for loop
        while (count < number) {
            if (number <= 0) {
                break;
            }
            System.out.println(number);
            number--;
        }
    }
}
