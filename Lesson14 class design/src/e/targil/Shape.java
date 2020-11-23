package e.targil;

/*
 * abstract class
 * 1. cannot be instantiated
 * 
 * 2. used for polymorphism - Shape[] 
 * 
 * 3. can contain concrete methods
 * 
* 4. can contain abstract methods
* */
public abstract class Shape {
	
	private String color;
	
	public Shape() {
		
	}
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Shape(String color) {
		super();
		this.color = color;
	}

	public abstract double getArea();

}
