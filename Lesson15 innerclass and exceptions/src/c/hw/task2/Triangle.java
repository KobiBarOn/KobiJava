package c.hw.task2;

public class Triangle extends IllegalTriangleException{
	
	private static final long serialVersionUID = 2L;

	public Triangle(double aSide, double bSide, double cSide) {
		super(aSide, bSide, cSide);
		this.aSide = aSide;
		this.bSide = bSide;
		this.cSide = cSide;
	}

	public void setaSide(double aSide) throws IllegalTriangleException{
		if(aSide + bSide > cSide && aSide + cSide > bSide) {				
			this.aSide = aSide;
		} else {
			IllegalTriangleException e = new IllegalTriangleException();
			throw e;
		}
	}

	public void setbSide(double bSide) throws IllegalTriangleException {
		if(bSide + aSide > cSide && bSide + cSide > aSide) {				
			this.bSide = bSide;
		} else {
			IllegalTriangleException e = new IllegalTriangleException();
			throw e;
		}
	}

	public void setcSide(double cSide) throws IllegalTriangleException {
		if(cSide + aSide > bSide && cSide + bSide > aSide) {				
			this.cSide = cSide;
		} else {
			IllegalTriangleException e = new IllegalTriangleException();
			throw e;
		}
	}

	@Override
	public String toString() {
		return "Triangle [A side=" + aSide + ", B side=" + bSide + ", C side=" + cSide + "]";
	}
	
	

	
}
