package 김준연;

public class p211_MyRectangleTest {

	public static void main(String[] args) {
		p211_MyRectangle r1=new p211_MyRectangle();
		r1.setX(10);
		r1.setY(10);
		r1.setWidth(5);
		r1.setHeight(4);
		System.out.println("면적은 "+r1.getArea()+"입니다.");
		MyPoint p=new MyPoint();
		p.setX(3);
		p.setY(5);
		System.out.println(p.getX()+", "+p.getY());
	}
}
class p211_MyRectangle
{
	private MyPoint corner=new MyPoint();
	private int width,height;
	
	
	public int getX() {
		return corner.getX();
	}
	public void setX(int x) {
		 corner.setX(x);
	}
	public int getY() {
		return corner.getY();
	}
	public void setY(int y) {
		corner.setY(y);
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int newW)
	{
		width=newW;
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int newH)
	{
		height=newH;
	}
	public void resize(int newW,int newH)
	{
		width=newW;
		height=newH;
	}
	public int getArea()
	{
		return width*height;
	}
}
class MyPoint
{
	private int x,y;
	public int getX()
	{
		return x;
	}
	public void setX(int newX)
	{
		x=newX;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}