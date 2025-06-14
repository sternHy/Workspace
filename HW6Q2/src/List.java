public class List<T extends Comparable<T>> implements MinMax<T> {
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

	@Override
	public T Min() {
		ListItem<T> i = head;
		T res = head.getInfo();
		while (i.getNext() != null) {
			if (res.compareTo(i.getInfo()) > 0)
				res = i.getInfo();
		}
		return res;
	}

	@Override
	public T Max() {
		ListItem<T> i = head;
		T res = head.getInfo();
		while (i.getNext() != null) {
			if (res.compareTo(i.getInfo()) < 0)
				res = i.getInfo();
		}
		return res;
	}

}
