import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {

        // We initialise the scanner and the list into which the input is read
        final Scanner scanner = new Scanner(System.in);
       final List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            System.out.println("Please enter a number, typing " + '\u0022' + "end" + '\u0022' + " will print out the number average and stops the code");
            String row = scanner.nextLine();
            if (row.equalsIgnoreCase("end")) {
                break;
            }

            inputs.add(row);
        }


        // working out the average
        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("The average of the numbers: "+ average);

    }
}