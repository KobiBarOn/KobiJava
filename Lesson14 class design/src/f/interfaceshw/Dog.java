package f.interfaceshw;

public class Dog extends Mammal implements Navigator {

	@Override
	public void speak() {
		System.out.println("Speak like a Dog");
	}
	@Override
	public void navigate() {
		System.out.println("Navigate like a Dog");
	}
}
