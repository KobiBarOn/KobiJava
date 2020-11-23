package c.hw.task1;

public class Point {
	
		int x;
		int y;
		int MIN_VALUE = 0;
		int MAX_VALUE = 100;
		
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) throws Exception {
			if(MIN_VALUE < x && MAX_VALUE > x) {				
				this.x = x;
				System.out.println("X= " + x);
			} else {
				if (x < MIN_VALUE) {
				x = MIN_VALUE;
			    Exception outOfRange = new Exception("X is set to the minimum value: " + x);
			    throw outOfRange;
				} else if (x > MAX_VALUE) {
				x = MAX_VALUE;
				Exception outOfRange = new Exception("X is set to the maximum value: " + x);
				throw outOfRange;
				}
			}
		}
		public int getY() {
			return y;
		}
		public void setY(int y) throws Exception {
			    if(MIN_VALUE < y && MAX_VALUE > y) {				
				this.y = y;
				System.out.println("Y= " + y);
			} else {
				if (y < MIN_VALUE) {
					y = MIN_VALUE;
				    Exception outOfRange = new Exception("Y is set to the minimum value: " + y);
				    throw outOfRange;
					} else if (y > MAX_VALUE) {
					y = MAX_VALUE;
					Exception outOfRange = new Exception("Y is set to the maximum value: " + y);
					throw outOfRange;
				}
			}
		}
		
}
