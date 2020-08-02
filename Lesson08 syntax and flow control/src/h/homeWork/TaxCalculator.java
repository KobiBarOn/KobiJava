package h.homeWork;

public class TaxCalculator {

	public static void main(String[] args) {

		int sal = (int) (Math.random() * 100001);
		System.out.println("The employee salary before additional tax is:\n" + sal);
		System.out.println("============");

		if (sal < 23_000) {
			float tax1 = sal * 1.1F;
			System.out.println("The employee salary including 10% additional tax is:\n" + tax1);
			System.out.println("============");
		} else if (sal < 50_000) {
			float tax2 = sal * 1.2F;
			System.out.println("The employee salary including 20% additional tax is:\n" + tax2);
			System.out.println("============");
		} else if (sal < 100_000) {
			float tax3 = sal * 1.3F;
			System.out.println("The employee salary including 30% additional tax is:\n" + tax3);
			System.out.println("============");
		} else {
			float tax4 = sal * 1.4F;
			System.out.println("The employee salary including 40% additional tax is:\n" + tax4);
			System.out.println("============");
		}
	}

}
