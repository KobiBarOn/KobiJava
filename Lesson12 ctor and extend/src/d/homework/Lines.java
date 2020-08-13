package d.homework;

public class Lines {

	private int length;

	public Lines(int length) {
		super();
		this.length = length;
	}

	public void draw() {
		for (int i = 0; i < length; i++) {
			System.out.print(" * ");
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
