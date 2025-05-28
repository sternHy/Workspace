public class List {
    private Head head;

    public List() {
        head = new Head();
    }

    public void insert(Data d) {
        head.insert(d);
    }

    public void show() {
        head.show();
    }
}