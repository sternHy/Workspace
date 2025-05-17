public class Program {

    public static void main(String[] args) {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(2, 5);

        System.out.println("Rational numbers:");
        r1.show();
        r2.show();

        System.out.println("Addition: " + r1.add(r2).toString());
        System.out.println("Subtraction: " + r1.sub(r2).toString());
        System.out.println("Multiplication: " + r1.mul(r2).toString());
        System.out.println("Division: " + r1.div(r2).toString());

        System.out.println("Equality check: " + r1.equals(new Rational(6, 8)));

        Rational rClone = r1.clone();
        System.out.println("Cloned Rational: " + rClone);
    }
}
