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
enum beanType { bean1,bean2,bean3 }
	
class Coffee extends Beverage
{
	beanType bean;
	
	private String toValue()
	{
		String bt=null;
		switch(bean)
		{
		case bean1:
			bt="bean1";
			break;
		case bean2:
			bt="bean2";
			break;
		case bean3:
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
		return super.info()+" (원두 : "+toValue()+")";
	}
}
class Latte extends Coffee
{
	int milkAmount;
	public Latte(String name,int price,beanType bt, int milk) {super(name,price,bt); milkAmount = milk;}
	String info()
	{
		return super.info()+" (사용된 우유량 : "+milkAmount+"mL)";
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
		Beverage[] drinks = {
			new Beverage("물",1000),
			new Beverage("오렌지주스",2300),
			new Coffee("아메리카노",4000,beanType.bean1),
			new Latte("라떼",5600,beanType.bean2,20)
		};
		
	}
}
