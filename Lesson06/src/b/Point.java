package b;

public class Point {

	// attributes

	int x;
	int y;

	// methods

	void moveRight() {
		x++;
	}

	void moveLeft() {
		x--;
	}

	void moveUp() {
		y++;
	}

	void moveDown() {
		y--;
	}

	// x=3,y=6
	void print() {

		System.out.print("(");
		System.out.print(x);
		System.out.print(",");
		System.out.print(y);
		System.out.println(")");

	}

}
