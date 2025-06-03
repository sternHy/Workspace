
public class List<T> {
	private ListItem<T> head;

	public List() {
		this.head = null;
	}

	public void addItemAtStart(T info) {
		head = new ListItem<T>(info, head);
	}

	public ListItem<T> getLastItem() {
		ListItem<T> node = head;
		while (node.getNext() != null) {
			node = node.getNext();
		}
		return node;
	}

	public void addItemAtEnd(T info) {
		ListItem<T> last = this.getLastItem();
		ListItem<T> end = null;
		last.setNext(info, end);
	}

	public void removeHead() {
		this.head = head.getNext();
	}

	public void removeLastItem() {
		if (this.head == null || this.head.getNext() == null) {
			this.head = null;
			return;
		}
		ListItem<T> node = head;
		while (node.getNext().getNext() != null) {
			node = node.getNext();
		}
		node.setAsLast();
	}

	public void show() {
		ListItem<T> node = head;
		while (node != null) {
			node.show();
			System.out.print("->");
			node = node.getNext();
		}
		System.out.println("null");
	}

	public void removeItem(T info) {
		if (info == this.getLastItem().getInfo()) {
			this.removeLastItem();
			return;
		}

		if (info.equals(head.getInfo())) {
			this.removeHead();
			return;
		}

		if (this.head == null || this.head.getNext() == null) {
			this.head = null;
			return;
		}
		ListItem<T> cur = head;
		while (cur != null) {
			T i = cur.getNext().getInfo();
			if (i.equals(info)) {
				cur.setNext(cur.getNext().getNext());
				return;
			}
			cur = cur.getNext();
		}
	}

}
