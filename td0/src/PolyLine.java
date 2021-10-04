package fr.dauphine.javaavance.td1;

import java.util.*;

public class PolyLine {
	//private Point[] myPoints;
	//static final int MAX_CAP=50;
	private LinkedList<Point> myPoints;
	public PolyLine(Point[] pt) {
		this.myPoints = new LinkedList<Point>();
		for(Point p : pt) {
			this.myPoints.add(p);
		}
	}
	
	public void add(Point p) {
		Objects.requireNonNull(p);
//		Point[] newPoints = new Point[this.myPoints.length+1];
//		for(int i=0;i<this.myPoints.length;i++) {
//			newPoints[i] = new Point(this.myPoints[i]);
//		}
//		newPoints[this.myPoints.length] = p; 
//		this.myPoints = newPoints;
		this.myPoints.add(p);
	}
//	public int pointCapacity() {
//		return this.myPoints.length;
//	}
	public int nbPoints() {
//		int compt = 0;
//		for(int i=0;i<this.myPoints.length;i++) {
//			if(this.myPoints[i] instanceof Point) {
//				compt++;
//			}
//		}
		return this.myPoints.size();
	}
	public boolean contains(Point p) {
		Objects.requireNonNull(p);
//		for(Point pt : this.myPoints) {
//			if(pt.equals(p)) {
//				return true;
//			}
//		}
//		return false;
		return this.myPoints.contains(p);
	}
}


