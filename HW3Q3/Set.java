public class Set implements Arithmetic, ScanOp{
	private Object[] objs;
	private int counter;
	private int pointer = -1;;
	
	public Set(int max, Object ...objects) {
		objs = new Object[max];
		for (Object o:objects) {
			append(o);
		}
	}
	
	public boolean isIn(Object o) {
		for (int i=0; i<counter; i++) {
			if (o.equals(objs[i])) return true;
		}
		return false;
	}
	
	public boolean append(Object o) {
		if (counter == objs.length || this.isIn(o)) return false;
		objs[counter++] = o;
		return true;
	}
	
	public boolean isLast(int p) {
		for (int i=p+1; i<counter; i++) {
			if (objs[p].getClass() == objs[i].getClass()) {
				return false;
			}
		}
		return true;
	}
	
	public String toString() {
		String res = "";
		for (int i=0; i<counter; i++) {
			if (this.isLast(i)) {
				res += "(" + objs[i].getClass().toString() + ":";
				int count = 0;
				for (int j=0; j<counter; j++) {
					if (objs[j].getClass() == objs[i].getClass()) count++;
				}
				res += count + ")";
			}
		}
		return res;
	}
	
	public Set add(Arithmetic a) {
		if (!(a instanceof Set)) return null;
		Set s = (Set)a;
		Set res = new Set(this.counter + s.counter);
		for (int i=0; i<counter; i++) {
			res.append(objs[i]);
		}
		for (int i=0; i<s.counter; i++) {
			res.append(s.objs[i]);
		}
		return res;
	}
	
	public Set sub(Arithmetic a) {
		if (!(a instanceof Set)) return null;
		Set s = (Set)a;
		Set res = new Set(counter);
		for (int i=0; i<counter; i++) {
			if (!s.isIn(objs[i]))
				if (!res.append(objs[i])) return null;
		}
		return res;
	}
	
	public Set mul(Arithmetic a) {
		if (!(a instanceof Set)) return null;
		Set s = (Set)a;
		Set res = new Set(counter);
		for (int i=0; i<counter; i++) {
			if (s.isIn(objs[i]))
				if (!res.append(objs[i])) return null;
		}
		return res;
	}
	
	public Set div(Arithmetic a) {
		return null;
	}
	
	public Object[] fromType(Class c) {
		int len = 0;
		for (int i=0; i<counter; i++) if (objs[i].getClass() == c) len++;
		Object[] res = new Object[len];
		for (int i=0, j=0; i<counter; i++) {
			if (objs[i].getClass() == c) res[j++] = objs[i];
		}
		return res;
	}
	
	public Class[] getTypes() {
		int len = 0;
		for (int i=0; i<counter; i++) {
			if (this.isLast(i)) len++;
		}
		Class[] res = new Class[len];
		for (int i=0, k=0; i<counter; i++) {
			if (this.isLast(i)) res[k++] = objs[i].getClass();
		}
		return res;
	}
	
	public void reset() {
		pointer = -1;
	}
	
	public boolean forward() {
		if (pointer < counter-1) {
			pointer++;
			return true;
		}
		return false;
	}
	
	public boolean backward() {
		if (pointer > 0) {
			pointer--;
			return true;
		}
		return false;
	}
	
    public Object getCurrent() {
        if (pointer >= 0 && pointer < counter) {
            return objs[pointer];
        }
        return null;
    }
}
