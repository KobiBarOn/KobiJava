package d;

/**
 * this demo shows all java primitives
 *
 * @author Kobi
 */
public class JavaPrimitives {

	public static void main(String args[]) {
		// numerals integers or decimals

		System.out.println(5); // integer
		System.out.println(5.321); // decimal

		// integers numerals
		byte x1 = 3; // 8 bit memory space usage 2^8 = 256
		short x2 = 16; // 16 bit memory space usage
		int x3 = 25; // 32 bit memory space usage - DEFAULT!
		long x4 = 60; // 64 bit memory space usage
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);

		// bit - Binary Digit
		// סיבית - ספרה בינארית

		// 0, 1, 10, 11, 100
		// 00000000
		// 00000001
		// 11111111

		// decimal numerals
		float f1 = 5.6F; // 32 bit
		double f2 = 5.3; // 64 bit - DEFAULT!
		System.out.println(f1);
		System.out.println(f2);

		System.out.println(3.33333333333333333333333333); // almost precise
		System.out.println(3.3333333333333333333333333F); // barley precise

		// sufix F, D and L - float, double and long (literals only)
		System.out.println(5);
		System.out.println(5D);
		System.out.println(5F);
		System.out.println(999999999);
		System.out.println(99999999999L); // without L in the end = error!

		int x = 5;
		float y = 54.36F;
		long z = 1500;
		// define a sum variable and print it

		float sum1 = x + y + z; // float - summary for different variable types - the lowest
		// memory usage preferred and can contain all numeral types
		System.out.println(sum1);
		float sum2 = x + y + z; // double - also can work but will take more memory usage
		System.out.println(sum2);

		// LOGICAL
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 < 100;
		boolean b4 = 10 > 100;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		// CHARACTER
		// char 16 bit unicode
		char c1 = 'A';
		char c2 = 'ת';
		char c3 = '.';
		char c4 = ' ';
		char c5 = '+';
		char c6 = '5';
		char c7 = '"';
		char c8 = '\n'; // new line

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);

	}

}