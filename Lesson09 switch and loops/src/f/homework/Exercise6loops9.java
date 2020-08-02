package f.homework;

public class Exercise6loops9 {

	public static void main(String[] args) {

		int index = (int) (Math.random() * 51); // ספירה באינדקס תמיד תתחיל מ-0!
		// int index = 6;
		System.out.println("The index is: " + index);

		int temp = index;
		int f1 = 1;
		int f2 = 1;

		System.out.println(f1);

		while (index > 2) {
			f2 = f2 + f1;
			f1 = f2 - f1;
			index--;
			System.out.println(f1);
		}
		System.out.println("The fibonacci of " + temp + " is: " + f2);

	}
}