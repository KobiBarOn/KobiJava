package b;

public class App {

	public static void main(String[] args) {

		Point point = new Point();
		point.x = 3;
		point.y = 6;
		point.print();

		point.moveRight();
		point.print();
		point.moveRight();
		point.print();
		point.moveUp();
		point.print();
		point.moveDown();
		point.print();
		point.moveUp();
		point.print();
	}

}
