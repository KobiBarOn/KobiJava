package e.polymorphismhw;

public class TestShapes {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(4.5, 10.5);
		System.out.println("Rectangle: " + rec.getArea());

		rec.setWidth(2.5);
		rec.setLength(5);

		System.out.println("The New Rectangle Area is: " + rec.getArea());

		Circle circle = new Circle(6.5);
		System.out.println("Circle: " + circle.getArea());

		circle.setRadius(2.5);

		System.out.println("The New Circle Area is: " + circle.getArea());

		Shape[] shapes = new Shape[100];
        Error
		// נתקעתי באכלוס רנדומלי של סוג הצורה!!!!
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = new Circle((double) (Math.random() * 101));
			shapes[i] = new Rectangle((double) (Math.random() * 101), (double) (Math.random() * 101));
		}

		for (int i = 0; i < shapes.length; i++) {
			Shape current = shapes[i]; // reference to current element
			if ((current.getClass() != Shape.class)) {
				System.out.println("area: " + current.getArea() + ": " + current.getClass().getSimpleName());
			} else {
				System.out.println("no area");
			}
		}

	}

}