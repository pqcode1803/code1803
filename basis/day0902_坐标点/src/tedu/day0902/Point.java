package tedu.day0902;

public class Point {
	private int x;
	private int y;
	
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
	
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	public double distance(Point p) {
		//��ǰ������Ͳ�����p�������ֵ
		int dx = x-p.x;
		int dy = y-p.y;
		//z�Ĳ�ֵ
		int dz=0;//���趼�Ƕ�ά�㣬z��ֵ0
		if(p instanceof Point3D) {
			Point3D p3d = (Point3D) p;
			dz = p3d.getZ();
		}
		
		return Math.sqrt(dx*dx+dy*dy+dz*dz);
	}
}






