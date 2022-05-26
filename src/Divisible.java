import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(-17);
        nums.add(-5);
        nums.add(7);
        ArrayList<Integer> divisible = divisible(nums);

             divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    private static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return   numbers.stream()
                .filter(nums -> nums % 2 == 0 || nums % 3 == 0 || nums % 5 == 0 )
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
