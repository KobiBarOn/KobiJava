package d.homework;

public class Wline extends Lines {

	private int width;

	public Wline(int length, int width) {
		super(length);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void draw() {
		for (int i = 0; i < width; i++) {
			super.draw();
			System.out.println();
		}
	}

}
