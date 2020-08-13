package d.homework.lines.tests;

import d.homework.Lines;
import d.homework.Wline;

public class App1 {

	public static void main(String[] args) {

		Lines line = new Lines(7);
		line.draw();
		System.out.println();
		System.out.println("=========");

		line.setLength(5);
		line.draw();

		System.out.println();
		System.out.println("=========");

		Wline wLine = new Wline(10, 3);
		wLine.draw();

		System.out.println("=========");

		// set length and width
		wLine.setLength(5);
		wLine.setWidth(3);
		wLine.draw();
	}

}
