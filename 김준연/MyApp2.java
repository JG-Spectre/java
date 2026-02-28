package 김준연;

public class MyApp2 {

	public static void main(String[] args) {
		StaticTests ob1=new StaticTests();
		StaticTests ob2=new StaticTests();
		ob1.setValue(3);
		System.out.println(ob2.getValue());
		ob1.setInstVal(5);
		System.out.println(ob2.getInstVal());
	}
}

class StaticTests
{
	static int value;
	int instVal;
	void setValue(int n)
	{
		value=n;
	}
	int getValue()
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