package f.casting;

public class Demo1 {

	public static void main(String[] args) {
		{
			long a = 10;
			// casting will convert from one type to another
			System.out.println(a);
			System.out.println((double) a);

			// some times casting will change the value
			double x = 5.5;
			System.out.println(x);
			System.out.println((int) x);

			// when casting will change the value - we need to know about it
		}
		{
			int x = 5;
			long y = x; // this is casting (automatic - implicit)
			int z = (int) y; // this is casting (not automatic - explicit)

			System.out.println(3.3);
			System.out.println(3.3F);
			System.out.println((float) 3.3);

			double a = 3.5F;
			float b = (float) 3.5; //
			float c = 3.5F; // preferred
		}
	}
}
