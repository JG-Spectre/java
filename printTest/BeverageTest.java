package printTest;

class Beverage
{
	private String name;
	private int price;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public Beverage(String name,int price)
	{
		setName(name);
		setPrice(price);
	}
	String info()
	{
		//String str = String.format("%s - %d", getName(), getPrice());
		//String str = "%s - %d".formatted(getName(), getPrice());
		return getName()+" - "+getPrice()+"원"; 
	}
}

class Coffee extends Beverage
{
	beanType bean;
	enum beanType
	{
		bean1,bean2,bean3
	}
	
	private String toValue()
	{
		String bt;
		switch(bean)
		{
		case beanType.bean1:
			bt="bean1";
			break;
		case beanType.bean2:
			bt="bean2";
			break;
		case beanType.bean3:
			bt="bean3";
			break;
		}
		return bt;
	}

	public Coffee(String name,int price,beanType bt)
	{
		super(name,price); bean=bt;
	}
	String info()
	{
		return getName()+" - "+getPrice()+"원 (원두 : "+toValue()+")";
	}
}

public class BeverageTest {
//	enum 원두타입{
//		zero, one, two
//	}
//	원두타입 내원두=원두타입.one;
//	
//	if(내원두==원두타입.one) {
//		
//	}
	public static void main(String[] args) {
		
	}
}
