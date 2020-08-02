package h.homeWork;

// Exercise 4 – Operators
public class Operators {

	public static void main(String[] args) {

		int r1 = (int) (Math.random() * 101);
		System.out.println("The 1st number is:\n" + r1);
		System.out.println("============");
		// מהו הקוד לבחירת מספרים רנדומליים ללא הגדרת תחום?
		int r2 = (int) (Math.random() * 101);
		System.out.println("The 2nd number is:\n" + r2);
		System.out.println("============");
		int sum = r1 + r2;
		System.out.println("The summary of them both is:\n" + sum);
		System.out.println("============");
		double avg = (r1 + r2) / 2;
		System.out.println("The avrage of them both is:\n" + avg);
		System.out.println("============");
		// למה אני לא רואה ממוצע עם חצאים במקרה שהמספר אינו זוגי?
		int remainder1 = (int) (r1 % 10);
		int remainder2 = (int) (r2 % 10);
		System.out.println("the remainder of the 1st number is:\n" + remainder1);
		System.out.println("============");
		System.out.println("the remainder of the 2nd number is:\n" + remainder2);
		System.out.println("============");
		// במקרה שהמספר הינו חד ספרתי - חישוב השארית אינו נכון - הוא פשוט מחזיר את המספר
		// שנקלט. מדוע?
		int rectangle = r1 * r2;
		System.out.println("The rectangle area is:\n" + rectangle + "cms");
		System.out.println("============");
	}

}
