package a;

// class definition
public class Point {
	// attributes
	int x, y;

	// m the method
	public void printX() {
		int x = 100; // local x variable
		System.out.println(x); // print local x variable
		System.out.println(this.x); // print global x variable
		// the "this" reference (action) is a reference to the current project
		// the object that calls the method (the test program in this example)
	}

	// test program
	public static void main(String args[]) {
		Point p1 = new Point();
		p1.x = 250;
		p1.printX();

	}
}
