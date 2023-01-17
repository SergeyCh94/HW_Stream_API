import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            T min = list.get(0);
            T max = list.get(list.size() - 1);
            minMaxConsumer.accept(min, max);
        }
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(-1,2,3,4,5);
        findMinMax(stream, Comparator.naturalOrder(), (min, max) -> System.out.println("min: " + min + " max: " + max));
    }
}
