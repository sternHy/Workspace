
public class ListNode {

    private Object data;
    private ListNode nextNode;

    public ListNode(Object o) {
        this(o, null);
    }

    public ListNode(Object o, ListNode node) {
        data = o;
        nextNode = node;
    }

    public Object getObject() {
        return data;
    }

    public ListNode getNext() {
        return nextNode;
    }

    public void setNext(ListNode ln) {
        nextNode = ln;
    }

    public void show() {
        if (nextNode != null) {
            System.out.println(data);
            nextNode.show();
        }
    }

    public void showRev() {
        if (nextNode != null) {
            nextNode.show();
        }
        System.out.println(data);
    }
}
