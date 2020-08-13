package b;

public class App {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point(5, 9, "aaa", "bbb");
		Point p3 = new Point();

		p2.setX(1000); // out of value range - the program will not get this value
		// set methods - sets the value
		p2.setX(50); // in range - the program will get this value

		System.out.println("x = " + p2.getX());
		// get methods - returns the value
		System.out.println("y = " + p2.getY());

		System.out.println("end");

	}

}
