package c.methods;

public class Oceanrium {

	int waterLevel;

	void addWater(int liters) { // method definition contains parameters
		waterLevel += liters;

	}

	void addWater() {
		waterLevel++;
	}

	public static void main(String args[]) {
		Oceanrium oc = new Oceanrium();
		System.out.println(oc.waterLevel);

		oc.addWater(25); // method invocation contains arguments (25)
		System.out.println(oc.waterLevel);

		oc.addWater(10);
		System.out.println(oc.waterLevel);

		oc.addWater();
		System.out.println(oc.waterLevel);
	}
}