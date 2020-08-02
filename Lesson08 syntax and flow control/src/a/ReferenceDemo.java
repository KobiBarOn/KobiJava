package a;

public class ReferenceDemo {

	public static void main(String[] args) {

		// x is a primitive variable
		int x = 5;
		// str is a reference of type string
		// references are handles of objects
		String str = "aaa";
		// references are like a remote control
		// the objects of the references is like a TV (machine)
		str.length();
		str.charAt(0);
		System.out.println(str);
		System.out.println(str.length());

		Point p = new Point();
		p.x = 5;
		p.y = 3;

		System.out.println(p.x);
		System.out.println(p.y);

	}

}
