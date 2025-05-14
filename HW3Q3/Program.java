
public class Program {

	public static void main(String[] args) {
        Set set1 = new Set(10,
            new Point(1, 2),
            new Rectangle(2, 4),
            new Rectangle(2, 4),
            new Point(2, 3)
        );
        Set set2 = new Set(10,
            new Point(2, 3),
            new Rectangle(3, 5)
        );
        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        System.out.println("add: " + set1.add(set2));
        System.out.println("sub: " + set1.sub(set2));
        System.out.println("intersect: " + set1.mul(set2));

        System.out.println("Types in Set 1:");
        for (Class c:set1.getTypes()) {
            System.out.println(c);
        }

        System.out.println("All Points in Set 1:");
        for (Object o : set1.fromType(Point.class)) {
            System.out.println(o);
        }

        System.out.println("forward:");
        set1.reset();
        while (set1.forward()) {
            System.out.println(set1.getCurrent());
        }

        System.out.println("backward:");
        while (set1.backward()) {
            System.out.println(set1.getCurrent());
        }
    }

}
