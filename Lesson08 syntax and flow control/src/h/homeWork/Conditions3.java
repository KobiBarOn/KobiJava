package h.homeWork;

// Create a new class that defines a random number with a value between 0-100
public class Conditions3 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("The number is:\n" + x);
		System.out.println("============");
		// מהו הקוד לבחירת מספרים רנדומליים ללא הגדרת תחום?
		if (x < 50) {
			System.out.println("Small !");
			System.out.println("============");
		} else {
			System.out.println("Big !");
			System.out.println("============");
		}

		if (x % 2 == 0) {
			System.out.println("Even");
			System.out.println("============");
		} else {
			System.out.println("Odd");
			System.out.println("============");
		}
	}

}
