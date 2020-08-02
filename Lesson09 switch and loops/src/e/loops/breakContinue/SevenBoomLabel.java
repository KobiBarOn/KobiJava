package e.loops.breakContinue;

public class SevenBoomLabel {

	public static void main(String[] args) {

		outerlooplablekobi: for (int i = 0; i <= 100; i++) { // label a loop (any kind of)

			// check if the number (i) divides by 7
			if (i % 7 == 0) {
				System.out.println("Boom");
				continue; // skip to next iteration
			}

			// check if the number (i) contains the digit 7
			int temp = i;
			while (temp != 0) {
				if (temp % 10 == 7) {
					System.out.println("Boom-");
					continue outerlooplablekobi; // skip out and go to the next i (to the label)
				}

				temp /= 10;
			}

			System.out.println(i);

		}

	}

}
