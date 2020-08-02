package f.homework;

public class Exercise6loops3 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("The number is: " + x);

		for (int i = 0; i <= x; i++) {

			// check if the number (i) divides by 2
			if (i % 2 == 0) {
				System.out.println(i);
				continue;

			}
		}
	}
}