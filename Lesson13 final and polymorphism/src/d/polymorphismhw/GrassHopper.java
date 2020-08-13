package d.polymorphismhw;

public class GrassHopper extends Mammal {

	public GrassHopper(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "Green";
	}

	@Override
	public double getWeight() {
		return 0.1;
	}

	public void jump() {
		System.out.println("I Jump Allot");
	}
}
