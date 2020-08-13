package a.exam;

import java.util.Scanner;

// בדיקת תכונות של מספר. למשל: האם זוגי. האם חיובי. האם המספר ראשוני
// האם המספר מתחלק ב 7, האם המספר גדול מערך מסוים, מה הספרה הימנית שלו = העמוד הראשון בקלסר שלי!!! 
public class ExamMaterialNumAttributes {

	public static void main(String[] args) {

		// system.out.println("enter a number: ");
		// scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();

		// האם המספר חיובי או שלילי
		// if (a > 0) {
		// System.out.println("Postive");
		// else {
		// System.out.println("Negative");
		//

		// האם המספר זוגי או אי זוגי
		// if (a % 2 == 0) {
		// System.out.println("Even");
		// else {
		// System.out.println("Not Even");
		//

		// האם הספר ראשוני או לא

		int i, m = 0, flag = 0;
		int n = 9; // it is the number to be checked
		m = 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

}
