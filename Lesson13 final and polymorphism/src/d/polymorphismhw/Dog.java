package d.polymorphismhw;

public class Dog extends Mammal {

	public Dog(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "Gold";
	}

	@Override
	public double getWeight() {
		return 7.2;
	}

	public void bite() {
		System.out.println("I Bite Allot");
	}

}