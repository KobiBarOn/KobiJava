package d.polymorphismhw;

public class Test {

	public static void main(String[] args) {

		// למה הוא דורש ממני להכניס נתונים בשלב זה?!?!?
		Cat cat = new Cat();
		Bird bird = new Bird();
		Dog dog = new Dog();
		Owl owl = new Owl();
		Hawk hawk = new Hawk();
		GrassHopper grasshopper = new GrassHopper();
		Sparrow sparrow = new Sparrow();

		operateAnimal(cat);
		operateAnimal(bird);
		operateAnimal(grasshopper);
		operateAnimal(dog);
		operateAnimal(owl);
		operateAnimal(hawk);
		operateAnimal(sparrow);
	}

	public static void operateAnimal(Animal animal) {
		animal.getWeight();
		animal.getColor();
		// what if the animal as a unique Atrribute?

		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.bite();
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.scratch();
		} else if (animal instanceof Bird) {
			Bird bird = (Bird) animal;
			bird.shit();
		} else if (animal instanceof GrassHopper) {
			GrassHopper grasshopper = (GrassHopper) animal;
			grasshopper.jump();
		} else if (animal instanceof Hawk) {
			Hawk hawk = (Hawk) animal;
			hawk.carcass();
		} else if (animal instanceof Sparrow) {
			Sparrow sparrow = (Sparrow) animal;
			sparrow.fall();
		} else {
			Owl owl = (Owl) animal;
			owl.night();
		}
	}

}