public class Internal extends Node {
    private Node next;
    private Data d;

    public Internal(Data d, Node nxt) {
        next = nxt;
        this.d = d;
    }

    public Node insert(Data d) {
        if (this.d.compare(d) == -1) {
            next = next.insert(d);
            return this;
        } else {
            Internal tmp = new Internal(d, this);
            return tmp;
        }
    }

    public void show() {
        d.show();
        next.show();
    }
}
