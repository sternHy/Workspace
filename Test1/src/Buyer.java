public class Buyer {
    private String name;
    private int phone, money;

    public Buyer(String n, int p, int m) {
        name = n;
        phone = p;
        money = m;
    }

    public int getMoney() {
        return money;
    }
}
