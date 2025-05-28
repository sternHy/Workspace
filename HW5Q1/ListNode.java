
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
        System.out.println(data);
        if (nextNode != null)
            nextNode.show();
    }

    public void showRev() {
        if (nextNode != null) {
            nextNode.showRev();
        }
        System.out.println(data);
    }
}
