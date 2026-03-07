package 김준연;

public class ArgumentTest {

	public static void main(String[] args) {
		int x=3,y=5;
		p206_MyInteger ob1=new p206_MyInteger(),ob2=new p206_MyInteger();
		swap(x,y);
		System.out.println("x : "+x+", y : "+y);
		ob1.setVal(3);
		ob2.setVal(5);
		swap(ob1,ob2);
		System.out.println("ob1 : "+ob1.getVal()+", ob2 : "+ob2.getVal());
	}
	public static void swap(int x,int y)
	{
		int tmp;
		tmp=x;
		x=y;
		y=tmp;
	}
	public static void swap(p206_MyInteger x,p206_MyInteger y)
	{
		int tmp;
		tmp=x.getVal();
		x.setVal(y.getVal());
		y.setVal(tmp);
	}
}
class p206_MyInteger
{
	private int x;
	int getVal()
	{
		return x;
	}
	void setVal(int val)
	{
		x=val;
	}
}
