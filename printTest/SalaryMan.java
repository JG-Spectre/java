package printTest;

class Salary
{
	private int monthinc;
	public Salary()
	{
		this(1000000);
	}
	public Salary(int inc)
	{
		monthinc = inc;
	}
	int getAnnualGross()
	{
		return monthinc*12 + monthinc*5; 
	}
}

public class SalaryMan {
	public static void main(String[] args) {
		System.out.println(new Salary().getAnnualGross());
		System.out.println(new Salary(2000000).getAnnualGross());
	}
}
