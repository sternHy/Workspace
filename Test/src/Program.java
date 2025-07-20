public class Program {
    // public static <T extends Comparable<T>> int resefs(List<T> l) {
    // T[] array = (T[]) l.toArray();
    // int max = 0;
    // for (int i = 1, count = 1; i < array.length - 1; i++) {
    // if (array[i - 1].compareTo(array[i]) == 0) {
    // count++;
    // if (count > max)
    // max = count;
    // } else
    // count = 0;
    // }
    // return max;
    // }

    // public static <T extends Comparable<T>> boolean
    // isResefsEqualsKey(Map<Integer, List<T>> m) {
    // for (int i : m.keySet()) {
    // if (i >= resefs(m.get(i)))
    // return false;
    // }
    // return true;
    // }

    public static void main(String[] args) {
        List<Integer> l1 = new List<Integer>();
        l1.insert(3);
        l1.insert(5);
        l1.insert(6);
        l1.insert(2);
        l1.insert(0);
        List<Integer> l2 = new List<Integer>();
        l2.insert(-1);
        l2.insert(-4);
        l2.insert(-7);
        l1.unknown(l2);
        l1.show();
    }

}
