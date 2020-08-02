package c.loops.forDemo;

public class Demo1ForBadParctice {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("x: " + x);

		for (int i = 1; i <= x; i++) {
			System.out.println(i + " ");
		}
// צרו שני מספרים אקראיים והדפיסו את כל המספרים שביניהם מהקטן לגדול

		int y = (int) (Math.random() * 101);
		System.out.println("y: " + y);

		int z = (int) (Math.random() * 101);
		System.out.println("z: " + z);

		for (int i = y; i <= z; i++) {
			System.out.println(i);
		}

		for (int i = z; i <= y; i++) {
			System.out.println(i);
		}

	}

}
