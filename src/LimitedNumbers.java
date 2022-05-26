import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        ArrayList<Integer> userInputs = new ArrayList<>();

        while(true) {
            System.out.println("Enter number: ");
            int userInput = in.nextInt();

            if (userInput < 0) {
                break;
            }

            userInputs.add(userInput);
        }

        userInputs.stream()
                .filter(num -> num > 0 && num < 6)
                .forEach(num -> System.out.println(num));
    }
}
