
public class ListItem<T> {
	private T info;
	private ListItem<T> next;

	public ListItem(T info, ListItem<T> next) {
		this.info = info;
		this.next = next;
	}

	public ListItem<T> getNext() {
		return next;
	}

	public void setNext(T info, ListItem<T> n) {
		this.next = new ListItem<T>(info, n);
	}

	public void show() {
		System.out.print(info);
	}

	public void setAsLast() {
		this.next = null;
	}

	public T getInfo() {
		return info;
	}

	public void setNext(ListItem<T> n) {
		this.next = n;
	}

}
