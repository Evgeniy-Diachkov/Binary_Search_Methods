import java.util.Comparator;
import java.util.List;

public class MyCollections {

    // Для List с естественным порядком
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return java.util.Collections.binarySearch(list, key);
    }

    // Для List с пользовательским Comparator
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return java.util.Collections.binarySearch(list, key, c);
    }
}

