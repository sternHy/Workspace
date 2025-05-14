public class Utility {

	public static void showAll(Showable[] a) {
		if (a == null) return;
		for (int i=0; i<a.length; i++) {
			a[i].show();
		}
	}

	public static void showAll(Object[] a) {
		if (a == null) return;
		for (int i=0; i<a.length; i++) {
			if (a[i] instanceof Showable) {
				((Showable)a[i]).show();
			} else {
				System.out.println(a[i].toString());
			}
		}
	}

	public static boolean search(Object[] a, Object o) {
		if (a == null) return false;
		for (int i=0; i<a.length; i++) {
			if (a[i] instanceof Comparable && o.getClass().equals(a[i].getClass())) {
				if (((Comparable)a[i]).compareTo(o) == 0) return true;
			} 
			else if (a[i].equals(o)) return true;
		}
		return false;
	}

	public static Object max(Object[] a) {
		if (a == null || a.length == 0) return null;
		if (!(a[0] instanceof Comparable)) return null;
		Object res = a[0];
		for (int i=1; i<a.length; i++) {
			if (!(a[i] instanceof Comparable || res.getClass() == a[i].getClass())) return null;
			if (((Comparable)a[i]).compareTo(res) > 0) {
				res = a[i];
			}
		}
		return res;
	}
}
