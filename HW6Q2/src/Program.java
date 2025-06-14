
import java.util.*;

public class Program {

    public static <T extends Comparable<T>> int resefs(List<T> l) {
        T[] array = (T[]) l.toArray();
        int max = 0;
        for (int i = 1, count = 1; i < array.length - 1; i++) {
            if (array[i - 1].compareTo(array[i]) == 0) {
                
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> boolean isResefsEqualsKey(Map<Integer, List<T>> m) {
        for (int i : m.keySet()) {
            if (i >= resefs(m.get(i))) {
                return false;
            }
        }
        return true;
    }
}
