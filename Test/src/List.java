public class List<T extends Comparable<T>> {
    private ListNode<T> firstNode;

    public List() {
        firstNode = null;
    }

    public void insert(T item) {
        if (firstNode == null)
            firstNode = new ListNode<T>(item, null);
        else
            firstNode = new ListNode<T>(item, firstNode);

    }

    public void show() {
        ListNode<T> current = firstNode;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void unknown(List<T> l) {
        if (firstNode == null)
            return;
        ListNode<T> current = firstNode;
        T item = firstNode.getData();
        while (current != null) {
            if (current.getData().compareTo(item) > 0)
                item = current.getData();
            current = current.getNext();
        }
        current = firstNode;
        while (current.getData() != item) {
            current = current.getNext();
        }
        ListNode<T> temp = current.getNext();
        current.setNext(l.firstNode);
        ListNode<T> y = l.firstNode;
        while (y.getNext() != null) {
            y = y.getNext();
        }
        y.setNext(temp);
    }

}
