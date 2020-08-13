package d.polymorphismhw;

public class Cat extends Mammal {

	public Cat(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "White";
	}

	@Override
	public double getWeight() {
		return 3.5;
	}

	public void scratch() {
		System.out.println("I Scratch Allot");
	}
}
