package a.exam;

// לקלוט 2 מספרים ועבור כל מספר בתחום שביניהם להציג את מספר הספרות שלו 
public class ExamMaterialLoopsNesting2 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 1001);
		System.out.println("a: " + a);
		int b = (int) (Math.random() * 1001);
		System.out.println("b: " + b);
		int c = 1;

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println("a: " + a);
			System.out.println("b: " + b);
		}

		while (b > a) {
			int tempo = a;
			System.out.println(tempo);
			while (a > 9) {
				int leftdigit = a / 10;
				a = leftdigit;
				c++;
			}
			tempo++;
			System.out.println("the amount of digits: " + c);
		}

	}

}
