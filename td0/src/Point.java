package fr.dauphine.javaavance.td1;

public final class Point {
	private static int nbInstance = 0;
	private double x, y;
	public Point() {
		Point.nbInstance++;
	}
	public Point(double px, double py) {
		Point.nbInstance++;
		this.x = px;
		this.y = py;
	}
	
	public Point(Point p2) {
		Point.nbInstance++;
		this.x = p2.getX();
		this.y = p2.getY();
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public int getInstance() {
		int temp = Point.nbInstance;
		return temp;
	}
	public double getX() {
		double temp = this.x;
		return temp;
	}
	public double getY() {
		double temp = this.y;
		return temp;
	}
	public boolean isSameAs(Point p3) {
		if((this.x == p3.getX()) && (this.y == p3.getY())) {
			return true;
		}
		return false;
	}
	
	public void translate(double dx, double dy) {
		this.setX(this.x+dx);
		this.setY(this.y+dy);
	}
	public void translate(Point p) {
		this.setX(this.x+p.getX());
		this.setY(this.y+p.getY());
	}
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	@Override
	public boolean equals(Object j) {
		if(j instanceof Point) {
			Point temp = (Point) j;
			if((this.x == temp.getX()) && (this.y == temp.getY())) {
				return true;
			}
			return false;
		}
		return false;
	}
}
