
public class List {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    public List() {
        this("list");
    }

    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            firstNode = new ListNode(insertItem, firstNode);
        }
    }

    public void insertAtBack(Object insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode(insertItem);
        } else {
            ListNode last = new ListNode(insertItem);
            lastNode.setNext(last);
            lastNode = last;
        }
    }

    public Object removeFromFront() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        Object removedItem = firstNode.getObject();

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }
        return removedItem;
    }

    public Object removeFromBack() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }

        Object removedItem = lastNode.getObject();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode current = firstNode;

            while (current.getNext() != lastNode) {
                current = current.getNext();
            }

            lastNode = current;
            current.setNext(null);
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty " + name);
            return;
        }
        System.out.println("The " + name + " is : ");
        ListNode current = firstNode;

        while (current != null) {
            System.out.println(current.getObject());
            current = current.getNext();
        }
        System.out.println();
    }

    public String toString() {
        String res = "(";
        ListNode current = firstNode;
        while (current != null) {
            res += current.toString();
            if (current.getNext() != null) {
                res += ",";
            }
            current = current.getNext();
        }
        return res + ")";
    }

    public ListNode removeAt(int k) throws ListIndexOutOfBound {
        if (k < 0) {
            throw new ListIndexOutOfBound("The parameter given is negative");
        }
        if (k == 0) {
            removeFromFront();
        }
        ListNode res = firstNode;
        for (int i = k; i < k - 1; i--) {
            res = res.getNext();
            if (res == null) {
                throw new ListIndexOutOfBound("The parameter given is bigger than the list's size");
            }
        }
        if (res.getNext() == lastNode) {
            removeFromBack();
        }
        res.setNext(res.getNext().getNext());
        return res.getNext();
    }

    public void show() {
        if (firstNode == null) {
            return;
        } else {
            firstNode.show();
        }
    }

    public void showRev() {
        if (firstNode == null) {
            return;
        } else {
            firstNode.showRev();
        }
    }
}
