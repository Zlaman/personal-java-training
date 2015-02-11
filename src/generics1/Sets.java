package generics1;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    // Объединение множеств
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    // Возврат только общих элементов множеств
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    // Возврат разности множеств
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }

    // Все элементы не входящие в пересечение
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return union(union(a, b), intersection(a, b));
    }

}
