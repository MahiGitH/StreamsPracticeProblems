import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> inputs = new ArrayList<>();

     while (true) {
        System.out.println("Please enter a number, typing " + '\u0022' + "end" + '\u0022' + " will print out the number average and stops the code");
        String row = scan.nextLine();
        if (row.equalsIgnoreCase("end")) {
            break;
        }

        inputs.add(row);
    }

    // working out the average
    double PositiveAverage = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number->number > -1)
            .average()
            .getAsDouble();

    double negativeAverage = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number->number < 0)
            .average()
            .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choose = scan.nextLine();

        if (choose.equals("p")) {
            System.out.println("Average of the positive numbers: " + PositiveAverage);
        } else if (choose.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAverage);
        } else {
            System.out.println("Invalid choice!");
        }
}

}
