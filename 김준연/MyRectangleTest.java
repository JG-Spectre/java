package 김준연;

class MyRectangleWip
{
	private int x,y;
	private int width,height;
	
	
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

public class MyRectangleTest {

	public static void main(String[] args) {
		MyRectangleWip r1=new MyRectangleWip();
		r1.setX(10);
		r1.setY(10);
		r1.setWidth(5);
		r1.setHeight(5);
		System.out.println(r1.getArea());
	}
}
