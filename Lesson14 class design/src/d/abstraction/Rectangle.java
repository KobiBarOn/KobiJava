package d.abstraction;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width, String string) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String getColor() {
		return this.getColor();
	}

}
