
public class Tail extends Node {

    public Tail() {
    }

    public Node insert(Data d) {
        return new Internal(d, this);
    }

    public void show() {
    }
}
