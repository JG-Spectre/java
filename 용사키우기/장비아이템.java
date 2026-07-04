package 용사키우기;

public class 장비아이템 extends 아이템 
{
	private final int attackBonus;
	private final int defenseBonus;
	private boolean equipped;
	public 장비아이템(아이템아이디 id,int attackBonus, int defenseBonus)
	{
		super(id);
		this.attackBonus = attackBonus;
		this.defenseBonus = defenseBonus;
	}
	@Override
	public void 사용(용사 hero)
	{
		
	}
	public boolean 장착여부반환() { return equipped; }
	public int 공격력보너스반환() { return attackBonus; }
	public int 방어력보너스반환() { return defenseBonus; }
}
