package a.exam;

// קלט של נתונים עד לקבלת ערך מסוים (למשל עד שייקלט שלילי)
import java.util.Scanner;

public class ExamInsertUntilNegative {

	public static void main(String[] args) {

		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x > 0) {
			System.out.println(x + " is a positive number");
			System.out.println("enter next number: ");
			x = sc.nextInt();
			continue;
		}
		System.out.println(x + " is a negative number");

		sc.close();

	}

}
