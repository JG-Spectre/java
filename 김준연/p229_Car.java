package 김준연;

class Car
{
	private int speed;
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int s)
	{
		speed=s;
	}
	public void honk()
	{
		System.out.println("빵빵!");
	}
}

public class p229_Car {

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.setSpeed(80);
		System.out.println("현재 속도는 "+myCar.getSpeed());
	}
}
