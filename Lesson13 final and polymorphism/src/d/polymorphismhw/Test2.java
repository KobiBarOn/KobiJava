package d.polymorphismhw;

public class Test2 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];

		animals[0] = new Dog(7, "Black");
		animals[1] = new Cat(2.2, "White");
		animals[2] = new Hawk(3.7, "Brown");
		animals[3] = new Owl(2.3, "Grey");
		animals[4] = new GrassHopper(0.11, "Green");
		animals[5] = new Sparrow(0.85, "Brown");
		animals[6] = new Bird(0.33, "Black");
		animals[7] = new Dog(2.1, "Golden");
		animals[8] = new Sparrow(0.77, "Brown");
		animals[9] = new Hawk(4.2, "White");

		for (int i = 0; i < animals.length; i++) {
			Animal current = animals[i]; // reference to current element
			if ((current.getClass() != Animal.class)) {
				System.out.println("Animal: " + current.getClass().getSimpleName() + " : " + current.getWeight() + ": "
						+ current.getColor());
			} else {
				System.out.println("No Animal to present");
			}
		}

		for (int i = 0; i < animals.length; i++) {
			animals[i].getWeight();
			if (animals[i] instanceof Dog) {
				((Dog) animals[i]).bite();
			} else if (animals[i] instanceof Cat) {
				((Cat) animals[i]).scratch();
			} else if (animals[i] instanceof Bird) {
				((Bird) animals[i]).shit();
			} else if (animals[i] instanceof GrassHopper) {
				((GrassHopper) animals[i]).jump();
			} else if (animals[i] instanceof Hawk) {
				((Hawk) animals[i]).carcass();
			} else if (animals[i] instanceof Owl) {
				((Owl) animals[i]).night();
			} else {
				((Sparrow) animals[i]).fall();
			}
		}
	}
}