package 김준연;

public class MyInteger {
	int val;
	int add(MyInteger ob)
	{
		return this.val+ob.val;
	}
	int subtract(MyInteger ob)
	{
		return val-ob.val;
	}
	int multiply(MyInteger ob)
	{
		return val*ob.val;
	}
	double divide(MyInteger ob)
	{
		return ((double)val)/ob.val;
	}
}
