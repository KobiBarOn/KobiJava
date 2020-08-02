package b.arraysStaticInit;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// static init.if we know in advance the initiation:
		int[] arr1 = { 2, 4, 6 };
		char[] arr2 = { 'A', 'B', 'C', 'D' };
		String[] days = { "Sunday", "Monday", "Tuesday", "Wedensday" };

		// dynamic init
		// An Array list of the ABC...
		char c1 = 'A';
		char c2 = 'Z';

		char[] a2z = new char[c2 - c1 + 1];
		System.out.println(a2z.length);

		for (int i = 0, c = c1; i < a2z.length; i++, c++) {
			a2z[i] = (char) c;
		}
		// print in well arranged array list:
		System.out.println(Arrays.toString(a2z));
		System.out.println("==========");
		// print in attached arranged elements of array list:
		System.out.println(a2z);
		System.out.println("==========");
	}

}
