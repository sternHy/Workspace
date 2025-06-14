import java.util.*;

public class Program {

    public static void main(String[] args) {
        Collection<Object> c = Arrays.asList(1, 2, 2, 3, 3, 3, 1, 4);
        Map<Object, Integer> mc = calcFreq(c);
        for (Map.Entry<Object, Integer> entry : mc.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map calcFreq(Collection<Object> c) {
        Map<Object, Integer> res = new HashMap<Object, Integer>();
        for (Object o : c) {
            res.put(o, res.getOrDefault(o, 0) + 1);
        }
        return res;
    }
}
