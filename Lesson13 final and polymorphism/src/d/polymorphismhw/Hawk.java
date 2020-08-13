package d.polymorphismhw;

public class Hawk extends Bird {

	public Hawk(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "Brown";
	}

	@Override
	public double getWeight() {
		return 4.5;
	}

	public void carcass() {
		System.out.println("I Eat Carcass");
	}
}