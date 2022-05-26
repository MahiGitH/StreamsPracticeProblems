import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumber {
    public static void main(String[] args) {
    //Scanner scan = new Scanner(System.in);
    List<Integer> num = new ArrayList<>();
          num.add(3);
          num.add(7);
          num.add(4);
          num.add(2);
          num.add(6);
          System.out.println(positive(num));
          System.out.println(positiveAlt(num));

}
    public static List<Integer> positive(List<Integer> numbers){

        return numbers.stream()
                .filter(num-> num >-1)
                .collect(Collectors.toList());
    }

    public static List<Integer> positiveAlt(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > -1)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
