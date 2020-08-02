package b.loops.whileDemo;

public class Demo1While {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("The number is: " + x);

		// print all numbers from 0 to x
		int c = 0;

		while (c <= x) {
			System.out.println(c++ + " ");
		}
	}

}
