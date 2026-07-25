package 용사키우기;

import java.util.List;

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
		final List<아이템> inventory = hero.인벤토리반환();
		for (int i = 0; i < inventory.size();i++)
		{
			아이템 myitem = inventory.get(i);
			
			if(myitem.id == 아이템아이디.WOODEN_SWORD) {
				if (장착여부반환()) {
					해제();
					장착();
				}
			}
			if(myitem.id == 아이템아이디.IRON_SWORD) {
				hero.체력추가(80);
				System.out.println("회복 포션 사용! 체력 +80 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.IRON_SHIELD) {
				hero.체력추가(200);
				System.out.println("대형 회복 포션 사용! 체력 +200 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.IRON_SPEAR) {
				hero.체력설정(hero.getMaxhp());
				System.out.println("초대형 회복 포션 사용! 체력 +30 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.LEATHER_ARMOR) {
				hero.체력추가(30);
				System.out.println("소형 회복 포션 사용! 체력 +30 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.IRON_PLATE) {
				hero.체력추가(80);
				System.out.println("회복 포션 사용! 체력 +80 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.IRON_ARMOR) {
				hero.체력추가(200);
				System.out.println("대형 회복 포션 사용! 체력 +200 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.STEEL_PLATE) {
				hero.체력설정(hero.getMaxhp());
				System.out.println("초대형 회복 포션 사용! 체력 +30 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
		}
	}
	public void 해제(용사 hero)
	{
		
	}
	public boolean 장착여부반환() { return equipped; }
	public int 공격력보너스반환() { return attackBonus; }
	public int 방어력보너스반환() { return defenseBonus; }
}
