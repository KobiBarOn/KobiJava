package a.switching;

public class SwitchDemo2 {

	public static void main(String[] args) {

		// switch with 3 modes: ON, OFF, STAND_BY

		// 1 - 3 is legal
		int mode = (int) (Math.random() * 3) + 1;
		System.out.println(mode);

		switch (mode) {
		case 1: // = if
			System.out.println("ON");
			break;
		case 2: // = else if
			System.out.println("OFF");
			break;
		case 3: // = else if
			System.out.println("STAND_BY");
			break;
		default: // = else
			System.out.println(mode + " is illegal");
			break;
		}
	}

}
