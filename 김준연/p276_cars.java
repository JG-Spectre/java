package 김준연;

interface Car276
{
	public void showInfo();
}

class PassengerCar implements Car276
{
	private int seats;
	public PassengerCar() { seats = 2; }
	public PassengerCar(int n) { seats = n; }
	public int getSeats() { return seats; } public void setSeats(int seats) { this.seats = seats; }
	public void showInfo() { System.out.println("좌석 수  : "+seats); }
}

class Truck implements ITruck
{
	private int payload;
	public Truck() { payload = 100; }
	public Truck(int w) { payload = w; }
	public int getPayload() { return payload; }
	public void setPayload(int payload) { this.payload = payload; }
	public void showInfo() { System.out.println("적재 하중 : "+payload); }
	
}

interface ITruck extends Car276
{
	public int getPayload();
	public void setPayload(int payload);
}

class Pickup extends PassengerCar implements ITruck
{
	private int tow_capacity; Truck truck;
	public Pickup() { super(4); truck = new Truck(1000); tow_capacity = 10000; }
	public Pickup(int s, int w, int c) { super(s); truck = new Truck(w); tow_capacity = c; }
	public int getCapacity() { return tow_capacity; }
	public void setCapacity(int tow_capacity) { this.tow_capacity = tow_capacity; }
	public void showInfo() { System.out.println("좌석 수 : "+getSeats()+", 적재 하중 : "+getPayload()+", 견인 능력 : "+tow_capacity); }
	@Override public int getPayload() { return truck.getPayload(); }
	@Override public void setPayload(int w) { truck.setPayload(w); }
}

public class p276_cars {
	public static void main(String[] args) {
		Car276[] cars = new Car276[3];
		cars[0] = new PassengerCar();
		cars[1] = new Truck(500);
		cars[2] = new Pickup(4,2000,10000);
		for (int i=0;i<3;i++)
		{
			cars[i].showInfo();
		}
	}
}
