package printTest;
import java.util.Scanner;
enum beanType { bean1,bean2,bean3 }
class Beverage
{
	private String name; private int price;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public Beverage(String name,int price) { setName(name); setPrice(price); }
	String info() { return getName()+" - "+getPrice()+"원"; }
}
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
	public Coffee(String name,int price,beanType bt) { super(name,price); bean=bt; }
	String info() { return super.info()+" (원두 : "+toValue()+")"; }
}
class Latte extends Coffee
{
	int milkAmount;
	public Latte(String name,int price,beanType bt, int milk) { super(name,price,bt); milkAmount = milk; }
	String info() { return super.info()+" (사용된 우유량 : "+milkAmount+"mL)"; }
}
class Milk extends Beverage
{
	int milkAmount;
	public Milk(String name,int price,int milk) {super(name,price); milkAmount=milk;}
	String info() { return super.info()+" 사용된 우유량 : "+milkAmount+"mL)"; }
}

public class BeverageTest {
	public static void main(String[] args) {
		Beverage[] drinks = {
			new Beverage("물",1000),
			new Milk("바나나우유",1500,300),
			new Milk("딸기우유",1500,300),
			new Beverage("오렌지주스",2300),
			new Coffee("아메리카노",4000,beanType.bean1),
			new Coffee("에스프레소",3500,beanType.bean1),
			new Latte("라떼",5600,beanType.bean2,20)
		};
		Scanner sc = new Scanner(System.in); int balance = 20000;
		while (true)
		{
			System.out.println("음료 목록 (현재 잔액 : "+balance+"원)"); for (int i=0;i<drinks.length;i++) { System.out.println(i+1+". "+drinks[i].info()); } System.out.print("구매할 음료의 이름을 입력해주세요.(\'나가기\'로 종료)\n>>");
			String select = sc.nextLine(); boolean isExists = false; Beverage selDrink = null;
			if (select.equals("나가기")) { System.out.println("이용해주셔서 감사합니다.\n프로그램 종료"); break; }
			for (int i=0;i<drinks.length;i++) if (select.equals(drinks[i].getName())) { selDrink = drinks[i]; isExists = true; break; }
			
			if(isExists && balance >= selDrink.getPrice())
			{
				System.out.print(selDrink.getName()+" 음료를 구매하시겠습니까? 구매 후 잔액은 "+(balance-selDrink.getPrice())+"원입니다. (y/n)\n>>");
				String isyes = sc.nextLine();
				if (isyes.equals("y"))
				{
					balance -= selDrink.getPrice();
					System.out.println(selDrink.getName()+" 구매가 완료되었습니다! 이용해주셔서 감사합니다.\n현재 잔액은 "+balance+"원입니다.");
				}
				else System.out.println("구매를 취소했습니다.");
			}
			else System.out.println("음료를 찾을 수 없습니다. 음료의 이름을 다시 확인해주세요.");
		}
	}
}
