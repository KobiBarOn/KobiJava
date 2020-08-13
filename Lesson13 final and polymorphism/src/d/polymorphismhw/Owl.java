package d.polymorphismhw;

public class Owl extends Animal {

	public Owl(double weight, String color) {
		super(weight, color);
	}

	@Override
	public String getColor() {
		return "Grey";
	}

	@Override
	public double getWeight() {
		return 5.2;
	}

	public void night() {
		System.out.println("I'm Awake At Nights");
	}

}
