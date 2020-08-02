package f.homework;

public class Exercise6loops4 {

	public static void main(String[] args) {

		int den = (int) (Math.random() * 11);
		System.out.println("The den number is: " + den);
		int max = (int) (Math.random() * 101);
		System.out.println("The max number is: " + max);

		for (int i = 0; i <= max; i++) {

			// check if the number (i) divides by den
			if (i % den == 0) {
				System.out.println(i);
				continue;

			}
		}
	}
}