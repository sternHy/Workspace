public class Rational implements Showable, Arithmetic, Cloneable {
	private int mone, mechane;
	
	public Rational(int mo, int me) {
		mone = mo;
		mechane = me;
	}
	public Rational() {
		this(1, 2);
	}
	public Rational(Rational r) {
		this(r.mone, r.mechane);
	}
	
	public String toString() {
		return mone + "/" + mechane + "=" + (double)mone/mechane;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || Rational.class != o.getClass()) return false;
		Rational r = (Rational)(o);
		return mone/mechane == r.mone/r.mechane;
	}
	
	public void show() {
		System.out.println("Mone: " + mone + "\nMechane: " + mechane + "\nResult: " + (double)mone/mechane);
	}
	
	public Arithmetic add(Arithmetic a) {
		Rational r = (Rational)a;
		return new Rational(mone+r.mechane, mechane+r.mechane);
	}
	public Arithmetic sub(Arithmetic a) {
		Rational r = (Rational)a;
		return new Rational(mone-r.mechane, mechane-r.mechane);
	}
	public Arithmetic mul(Arithmetic a) {
		Rational r = (Rational)a;
		return new Rational(mone*r.mechane, mechane*r.mechane);
	}
	public Arithmetic div(Arithmetic a) {
		Rational r = (Rational)a;
		return new Rational(mone/r.mechane, mechane/r.mechane);
	}
	
    public Rational clone() {
        return new Rational(this);
    }
}
