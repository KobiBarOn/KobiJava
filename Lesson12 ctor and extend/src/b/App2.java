package b;

public class App2 {

	public static void main(String[] args) {

		PixelCTOR p1 = new PixelCTOR(10, 20, "Red");
		PixelCTOR p2 = new PixelCTOR(40, 50);

		System.out.println(p1.getX() + ", " + p1.getY() + ", " + p1.getColor());
		System.out.println(p2.getX() + ", " + p2.getY() + ", " + p2.getColor());

	}

}
