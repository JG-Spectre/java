package printTest;

class Account
{
	private String owner;
	private long balance;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public Account()
	{
		setOwner("가나다");
		setBalance(10000);
	}
	public long deposit(long amount)
	{
		setBalance(getBalance() + amount);
		return getBalance();
	}
	public long withdraw(long amount)
	{
		if (getBalance() < amount) System.out.println("요청된 금액이 잔액보다 많습니다.");
		else setBalance(getBalance() - amount);
		return getBalance();
	}
}

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setOwner("나다라");
		acc.setBalance(100000);
		System.out.println(acc.deposit(4000));
		System.out.println(acc.withdraw(10000500));	
	}
}
