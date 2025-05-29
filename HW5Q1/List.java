
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

    @Override
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

    public Object removeAt(int k) throws ListIndexOutOfBound {
        if (k < 0) {
            throw new ListIndexOutOfBound();
        }
        if (k == 0) {
            return removeFromFront();
        }
        ListNode res = firstNode;
        for (int i = 0; i < k - 1; i++) {
            res = res.getNext();
            if (res == null) {
                throw new ListIndexOutOfBound();
            }
        }
        if (res.getNext() == lastNode) {
            return removeFromBack();
        }
        res.setNext(res.getNext().getNext());
        return res.getObject();
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

    public void addAt(int k, Object o) throws ListIndexOutOfBound {
        if (k < 0) {
            throw new ListIndexOutOfBound();
        }
        if (k == 0) {
            insertAtFront(o);
            return;
        }
        ListNode res = firstNode;
        for (int i = 0; i < k - 1; i++) {
            res = res.getNext();
        }
        if (res.getNext() == lastNode) {
            insertAtBack(o);
            return;
        }
        res.setNext(new ListNode(o, res.getNext()));
    }

    public Object[] toArray() {
        int len = 0;
        ListNode current = firstNode;
        while (current != null) {
            len++;
            current = current.getNext();
        }
        Object[] res = new Object[len];
        current = firstNode;
        for (int i = 0; i < len; i++) {
            res[i] = current.getObject();
            current = current.getNext();
        }
        return res;
    }
}
