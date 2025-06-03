
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new List();
		l.addItemAtStart(200);
		l.show();
		l.addItemAtEnd(400);
		l.show();
		l.addItemAtEnd(500);
		l.show();
		l.removeItem(200);
		l.show();
	}

}
