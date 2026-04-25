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

public class BeverageTest {
	public static void main(String[] args) {
		
	}
}
