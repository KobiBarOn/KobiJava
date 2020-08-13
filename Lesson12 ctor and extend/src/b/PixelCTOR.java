package b;

// CTOR rules
// 1. if  we don't write any CTOR, compiler will add default COTR
// a. default CTOR - has no parameters. b. invokes super()
// 2. if we write any CTOR the default CTOR vanishes
// 3. the first line of any CTOR must call another CTOR in a different class = super(
// a. in the current class (this)
// b. in the super class (super)
// c. if we didn't specify the CTOR, the default is super()
// 4. On object creation (new) the Specify CTOR runs

public class PixelCTOR extends Point {

	// attribute
	private String color;

	public PixelCTOR(int x, int y, String color) {
		super(x, y); // invoke another CTOR in super class
		this.color = color;
	}

	public PixelCTOR(int x, int y) {
		this(x, y, "Black"); // invokes anothr CTOR in THIS class

	}

	// hot key short cut for getters and setters - Alt + Shift + S
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
