package 용사키우기;

public class 소모품아이템 extends 아이템 {
	private final int healAmount;
	public 소모품아이템(아이템아이디 id, int healAmount)
	{
		super(id);
		this.healAmount = healAmount;
	}
	@Override
	public void 사용(용사 hero)
	{
		
	}
	public int 회복량반환()
	{
		return healAmount;
	}
}
