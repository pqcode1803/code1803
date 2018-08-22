package tedu.day1303;

public class Point implements Comparable<Point> {
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
		return "Point [x=" + x + ", y=" + y + "]";
	}

	/*
	 * 当前对象与参数对象o比大小
	 * 当前对象大，正数
	 * 当前对象小，负数
	 * 大小相同，0
	 */
	@Override
	public int compareTo(Point o) {
		//按月份从小到大
		return x-o.x;
	}
}






