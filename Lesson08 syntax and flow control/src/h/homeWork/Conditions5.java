package h.homeWork;

// Create a class that defines 3 random numbers and prints the bigger value
public class Conditions5 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("The number 1st is:\n" + x);
		System.out.println("============");
		int y = (int) (Math.random() * 101);
		System.out.println("The number 2nd is:\n" + y);
		System.out.println("============");
		int z = (int) (Math.random() * 101);
		System.out.println("The number 3rd is:\n" + z);
		System.out.println("============");

		if (x > y && x > z) {
			System.out.println("The bigger number is the 1st number:\n" + x);
			System.out.println("============");
		} else if (y > x && y > z) {
			System.out.println("The bigger number is the 2nd number:\n" + y);
			System.out.println("============");
		} else {
			System.out.println("The bigger number is the 3rd number:\n" + z);
			System.out.println("============");
		}

	}

}
