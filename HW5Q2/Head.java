
public class Head extends Node {

    private Node next;

    public Head() {
        next = new Tail();
    }

    public Node insert(Data d) {
        next = next.insert(d);
        return this;
    }

    public void show() {
        next.show();
    }
}
