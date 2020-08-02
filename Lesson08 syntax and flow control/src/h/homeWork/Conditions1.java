package h.homeWork;

// Create a class that defines 2 random numbers and prints the bigger value
public class Conditions1 {

	public static void main(String[] args) {

		int r1 = (int) (Math.random() * 101);
		System.out.println("The 1st number is:\n" + r1);
		System.out.println("============");
		// מהו הקוד לבחירת מספרים רנדומליים ללא הגדרת תחום?
		int r2 = (int) (Math.random() * 101);
		System.out.println("The 2nd number is:\n" + r2);
		System.out.println("============");

		if (r1 > r2) {
			System.out.println("The bigger number is:\n" + r1);
			System.out.println("============");
		} else {
			System.out.println("The bigger number is:\n" + r2);
			System.out.println("============");
		}

	}

}
