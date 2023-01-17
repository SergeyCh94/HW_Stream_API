import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Task2 {
    public static void numbersOfEven() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        Stream<Integer> st = numbers.stream();
        Predicate<Integer> even = number -> number % 2 == 0;
        System.out.println(st.filter(even).count());
    }
    public static void main(String[] args) {
        numbersOfEven();
    }
}
