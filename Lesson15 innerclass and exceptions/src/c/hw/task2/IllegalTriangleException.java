package c.hw.task2;

public class IllegalTriangleException extends Exception {

	private static final long serialVersionUID = 1L;
	public double aSide;
	public double bSide;
	public double cSide;

  public IllegalTriangleException(double a, double b, double c) {
    this.aSide = a;
    this.bSide = b;
    this.cSide = c;
}
 public IllegalTriangleException() {
	 super("The sum of any two sides is NOT greater than the other side");
}
 
  public double getA() {
	return aSide;
}

  public double getB() {
	return bSide;
}

  public double getC() {
	return cSide;
}
  

}