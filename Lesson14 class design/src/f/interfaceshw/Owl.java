package f.interfaceshw;

public class Owl extends Bird implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("Speak like an owl");
		
	}
	
	@Override
	public void fly() {
		System.out.println("Fly like an owl");

	}

	@Override
	public void navigate() {
		System.out.println("Navigate like an owl");

	}

	@Override
	public void takeOff() {
		System.out.println("TakeOff like an owl");

	}

	@Override
	public void land() {
		System.out.println("Land like an owl");

	}


}
