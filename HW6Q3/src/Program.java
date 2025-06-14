import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

    }

    public static Map calcFreq(Collection<Object> c) {
        Map<Object, Integer> res = new HashMap<Object, Integer>();
        for (Object o : c) {
            res.put(o, res.getOrDefault(o, 0) + 1);
        }
        return res;
    }
}
