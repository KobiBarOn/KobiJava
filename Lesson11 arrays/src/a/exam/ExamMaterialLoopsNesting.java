package a.exam;

// קלוט 100 מספרים והצג את סכום הספרות שלהם
public class ExamMaterialLoopsNesting {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int x = (int) (Math.random() * 1001);
			System.out.println("the number is: " + x);
			int mun = 0;
			int sum = 0;
			while (x != 0) {
				int digit = x % 10;
				mun = mun * 10 + digit;
				sum = sum + (x % 10);
				x /= 10;
			}
			System.out.println("the digits summary is: " + sum);

		}
	}

}
