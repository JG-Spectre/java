package printTest;

class Circle
{
	protected double radius; protected static double PI = 3.141592;
	public Circle(double radius) {this.radius=radius;}
	public double getArea() {return radius*radius*PI;}
}

public class Cylinder {
	
	
	Circle circ; double height;
	double getVolume() {return circ.getArea()*height;}
	public Cylinder(double rad, double h)
	{
		circ=new Circle(rad);
		height=h;
	}
	public Cylinder(Circle cdin,double h)
	{
		circ=cdin;
		height=h;
	}
	
	public static void main(String[] args) {
		Cylinder cd=new Cylinder(2.8,5.6);
		Cylinder cd2=new Cylinder(new Circle(2.8),5.6);
		System.out.println("부피는 "+cd.getVolume());
		System.out.println("부피는 "+cd2.getVolume());
	}
}
