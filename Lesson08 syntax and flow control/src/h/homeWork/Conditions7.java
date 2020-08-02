package h.homeWork;

public class Conditions7 {

	public static void main(String[] args) {

		int year = (int) (Math.random() * 10001);
		System.out.println("The year is:\n" + year);
		System.out.println("============");

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("The year: " + year + " is a leap year");
			System.out.println("============");
		} else {
			System.out.println("The year: " + year + " isn't a leap year");
			System.out.println("============");
		}

	}

}
