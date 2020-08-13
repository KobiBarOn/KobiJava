package d.polymorphismhw;

public class Sparrow extends Mammal {

	public Sparrow(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "Yellow";
	}

	@Override
	public double getWeight() {
		return 0.5;
	}

	public void fall() {
		System.out.println("I Will Come In Fall");
	}
}
