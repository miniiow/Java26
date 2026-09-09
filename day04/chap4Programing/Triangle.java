package chap4Programing;

public class Triangle {
	double bottom;
	double hight;
	
	public Triangle(double bottom, double hight) {
		this.bottom = bottom;
		this.hight = hight;
	}
	
	public double findArea() {
		double area;
		area = (bottom * hight) / 2;
		return area;
	}
	
	public boolean isSameArea(Triangle r) {
		if(r.findArea() == this.findArea()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
