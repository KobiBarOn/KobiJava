package f.interfaceshw;

public class Sparrow extends Bird implements Navigator, Flyer {

	@Override
	public void speak() {
		System.out.println("Speak like a Sparrow");
		
	}

	@Override
	public void fly() {
		System.out.println("Fly like a Sparrow");

	}

	@Override
	public void navigate() {
		System.out.println("Navigate like a Sparrow");

	}


}
