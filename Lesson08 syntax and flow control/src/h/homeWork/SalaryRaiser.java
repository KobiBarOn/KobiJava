package h.homeWork;

public class SalaryRaiser {

	public static void main(String[] args) {

		int salary = (int) (Math.random() * (6000 - 5000 + 1) + 5000);
		System.out.println("Your current salary is:\n" + salary);
		System.out.println("============");
		// מהו הקוד לבחירת מספרים רנדומליים ללא הגדרת תחום?

		if (salary < 6000) {
			float upSal = salary * 1.1F;
			System.out.println("Your updated salary is:\n" + upSal);
		}
	}

}
