package b.finalDemo;

public class Demo1 {

	// "final" keyword is a modifier of data , methods & classes
	// "final" sets somthing to somrthing that cannot be changed
	// final variables cannot be reassigned
	// final methods cannot be overriden
	// final class cannot be inherited (extends)

	public static void main(String atgs[]) {

		// final data
		final int x = 5;
		// x = 100 // x cannot be changed after intialization // will not change to 100

		final int y; // declaration only (empty final)
		y = 50; // initialization
		// y = 9;

		System.out.println(y);
	}

}
