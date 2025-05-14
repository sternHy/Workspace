public class Program {
    public static void main(String[] args) {
        int[][] A = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
                             { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int k = 0;
        try {
            int i = 0;
            while (true) {
              if (method(A[i++]))
                    k++;
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("caught the exception");
        }
        System.out.println(k);
    }
    private static boolean method(int[] a) {
        return a.length >= 3 && a[2] == 3;
    }
}
