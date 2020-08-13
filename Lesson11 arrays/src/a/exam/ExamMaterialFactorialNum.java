package a.exam;

public class ExamMaterialFactorialNum {

	public static void main(String[] args) {

		// float num = (int) (Math.random() * 101);
		int num = 4;
		System.out.println("The number is: " + num);

		int i;
		int f = 1;

		for (i = 1; i <= num; i++) {
			f = f * i;
		}
		int beforeMax = f / num;
		System.out.println("1 value before the max value is: " + beforeMax);
		System.out.println("The factorial of " + num + " is: " + f);

	}
}