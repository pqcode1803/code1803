package tedu.day1101;

public class Point /*extends Object*/ {
	private int x;
	private int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		//参数的三种特殊情况
		if(obj==null) return false;
		if(obj==this) return true;
		if(! (obj instanceof Point)) return false;
		
		//x与参数obj的x比较
		Point p = (Point) obj;
		return x == p.x && 
			   y == p.y;
	}
}








