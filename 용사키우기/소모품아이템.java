package 용사키우기;

import java.util.ArrayList;
import java.util.List;

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
		final List<아이템> inventory = hero.인벤토리반환();
		for (int i = 0; i < inventory.size();i++)
		{
			아이템 myitem = inventory.get(i);
			
			if(myitem.id == 아이템아이디.SMALL_HEALTH_POTION) {
				hero.체력추가(30);
				System.out.println("소형 회복 포션 사용! 체력 +30 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.HEALTH_POTION) {
				hero.체력추가(80);
				System.out.println("회복 포션 사용! 체력 +80 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.BIG_HEALTH_POTION) {
				hero.체력추가(200);
				System.out.println("대형 회복 포션 사용! 체력 +200 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
			if(myitem.id == 아이템아이디.MEGA_HEALTH_POTION) {
				hero.체력설정(hero.getMaxhp());
				System.out.println("초대형 회복 포션 사용! 체력 +30 (현재 체력 : "+hero.체력반환()+"/"+hero.getMaxhp()+")");
				break;
			}
		}
	}
	public int 회복량반환()
	{
		return healAmount;
	}
}
