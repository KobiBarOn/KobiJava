package d.polymorphismhw;

public class Bird extends Animal {

	public Bird(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "Black";
	}

	@Override
	public double getWeight() {
		return 0.7;
	}

	public void shit() {
		System.out.println("Shits allot");
	}

}