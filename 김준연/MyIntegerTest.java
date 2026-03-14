package 김준연;

public class MyIntegerTest {

	public static void main(String[] args) {
		MyIntegers ob=new MyIntegers();
		int x=ob.add(5);
		double y=ob.add(3.5);
		System.out.println(x+", "+y);
		MyIntegers ob2=new MyIntegers();
		ob2.val=3;
		ob2.val=ob.add(ob2);
		System.out.println(ob2.val);
	}
}
class MyIntegers
{
	int val;
	int add(MyIntegers ob)
	{
		System.out.println("Hello");
		return this.val+ob.val;
	}
	int add(int i)
	{
		return this.val+i;
	}
	double add(double d)
	{
		return this.val+d;
	}
	int subtract(MyIntegers ob)
	{
		return this.val-ob.val;
	}
	int multiply(MyIntegers ob)
	{
		return this.val*ob.val;
	}
	double divide(MyIntegers ob)
	{
		return ((double) this.val)/ob.val;
	}
}