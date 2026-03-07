package 김준연;

public class MyApp3 {

	public static void main(String[] args) {
		StaticTest.setValue(3);
		System.out.println(StaticTest.getValue());
		StaticTest ob1 = new StaticTest();
		StaticTest ob2 = new StaticTest();
		ob1.setInstVal(5);
		System.out.println(ob2.getInstVal());
	}
}
class StaticTest
{
	static int value;
	int instVal;
	static void setValue(int n)
	{
		value=n;
	}
	static int getValue()
	{
		return value;
	}
	void setInstVal(int n)
	{
		instVal=n;
	}
	int getInstVal()
	{
		return instVal;
	}
}