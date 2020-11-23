package f.interfaceshw;

public class Bat extends Mammal implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("Speak like a Bat");
	}

	@Override
	public void fly() {
		System.out.println("Fly like a Bat");
	}

	@Override
	public void navigate() {
		System.out.println("Navigate like a Bat");

	}

	@Override
	public void takeOff() {
		System.out.println("Takeoff like a Bat");
	}

	@Override
	public void land() {
		System.out.println("Land like a Bat");
		
	}

}
