package a.exam;

// חישוב סכום, ממוצע, מינימום, מקסימום (על נתונים שהתקבלו מתור הקלט)
public class ExamMaterialSumAvgMinMax {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		int sum = a + b + c;
		System.out.println(sum);
		int avg = sum / 3;
		System.out.println(avg);

		// calculating the max number:
		if (a > b && a > c) {
			System.out.println(a + ": is the max number");
		} else if (b > a && b > c) {
			System.out.println(b + ": is the max number");
		} else {
			System.out.println(c + ": is the max number");

		}

		// calculating the min number:
		// if (a < b && a < c) {
		// System.out.println(a + ": is the min number");
		// } else if (b < a && b < c) {
		// System.out.println(b + ": is the min number");
		// } else {
		// System.out.println(c + ": is the min number");

		// }

	}

}
