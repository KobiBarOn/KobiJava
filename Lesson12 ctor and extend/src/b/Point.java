package b;

/**
 * A point instance as x, y location int the range 0 to 100 iclusive
 * 
 * @author Kobi
 *
 */

public class Point {

	// fields - attributes
	private int x;
	private int y;

	// A CTOR is a special methd that runs only on object creation
	// CTOR usually initialize the object state (value)
	// default CTOR (Constractor)
	public Point() {
		super(); // invoking (calling) another CTOR in the super class
		System.out.println(">>> CTOR");
	}

	public Point(int x, int y, String... str) { // varargs must be the last in line (String...str)
		super();
		setX(x);
		setX(y);
		System.out.println(">>> CTOR(x, y)");
	}

	// methods

	/**
	 * Set the value for X according to the specify value
	 * 
	 * @param val the specified value for X
	 */

	public void setX(int val) { // Bad code!
		if (val >= 0 && val <= 100) {
			x = val;
		}
	}

	public int getX() {
		return x;
	}

	public void setY(int y) { // Good code!
		if (y >= 0 && y <= 100) {
			this.y = y;
		}
	}

	public int getY() {
		return y;
	}
}
