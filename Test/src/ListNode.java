public class ListNode<T extends Comparable<T>> {
    private T data;
    private ListNode<T> nextNode;

    public ListNode(T o, ListNode<T> node) {
        data = o;
        nextNode = node;
    }

    public ListNode<T> getNext() {
        return nextNode;
    }

    public void setNext(ListNode<T> item) {
        nextNode = item;
    }

    public T getData() {
        return data;
    }
}
