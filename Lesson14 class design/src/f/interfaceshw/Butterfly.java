package f.interfaceshw;

public class Butterfly extends Insect implements Flyer {

	@Override
	public void speak() {
		System.out.println("Speak like a Butterfly");
		
	}

	@Override
		public void fly() {
			System.out.println("Fly like a Butterfly");		
	}


}
