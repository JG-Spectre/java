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
			
			if(myitem.아이템반환() == this.id) {
				hero.
			}
		}
	}
	public int 회복량반환()
	{
		return healAmount;
	}
}
