package 용사키우기;

import java.util.List;


enum 장비타입
{
	방어구, 무기
}

public class 장비아이템 extends 아이템 
{
	private final int attackBonus;
	private final int defenseBonus;
	private boolean equipped;
	장비타입 itemType;
	public 장비아이템(아이템아이디 id,int attackBonus, int defenseBonus, 장비타입 itemType)
	{
		this(id, attackBonus, defenseBonus, itemType, 0);
	}
	
	
	public 장비아이템(아이템아이디 id, int attackBonus, int defenseBonus, 장비타입 itemType, int value) {
		super(id, value);
		this.attackBonus = attackBonus;
		this.defenseBonus = defenseBonus;
		this.itemType = itemType;
	}


	@Override
	public void 사용(용사 hero)
	{
		final List<아이템> inventory = hero.인벤토리반환();
		for (int i = 0; i < inventory.size();i++)
		{
			아이템 myitem = inventory.get(i);
			
			if(myitem.id == 아이템아이디.WOODEN_SWORD) {
				장착(hero,myitem.id);
				hero.setAttack(hero.getAttack()+attackBonus);
				System.out.println("나무 검 장착 완료! (공격력 +3)");
			}
			if(myitem.id == 아이템아이디.IRON_SWORD) {
				장착(hero,myitem.id);
				hero.setAttack(hero.getAttack()+attackBonus);
				System.out.println("철제 검 장착 완료! (공격력 +7)");
			}
			if(myitem.id == 아이템아이디.IRON_SHIELD) {
				장착(hero,myitem.id);
				hero.setAttack(hero.getAttack()+attackBonus);
				System.out.println("철제 방패 장착 완료! (공격력 +7, 방어력 +3)");
			}
			if(myitem.id == 아이템아이디.IRON_SPEAR) {
				장착(hero,myitem.id);
				hero.setAttack(hero.getAttack()+attackBonus);
				System.out.println("철제 창 장착 완료! (공격력 +7, 방어력무시 +2)");
			}
			
			if(myitem.id == 아이템아이디.LEATHER_ARMOR) {
				장착(hero,myitem.id);
				hero.setDefense(hero.getDefense()+defenseBonus);
				System.out.println("가죽 갑옷 장착 완료! (방어력 +3)");
			}
			if(myitem.id == 아이템아이디.IRON_PLATE) {
				장착(hero,myitem.id);
				hero.setDefense(hero.getDefense()+defenseBonus);
				System.out.println("가죽 갑옷 플레이트 장착 완료! (방어력 +3, 시작쉴드 +5)");
			}
			if(myitem.id == 아이템아이디.IRON_ARMOR) {
				장착(hero,myitem.id);
				hero.setDefense(hero.getDefense()+defenseBonus);
				System.out.println("철제 갑옷 장착 완료! (방어력 +8)");
			}
			if(myitem.id == 아이템아이디.STEEL_PLATE) {
				장착(hero,myitem.id);
				hero.setDefense(hero.getDefense()+defenseBonus);
				System.out.println("강철 갑옷 플레이트 장착 완료! (방어력 +8, 시작쉴드 +20)");
			}
		}
	}
	public void 해제(용사 hero,아이템아이디 id)
	{
		equipped = false;
		switch (itemType)
		{
		case 무기:{ hero.setAttack(hero.getAttack()-attackBonus); if(id == 아이템아이디.IRON_SHIELD) hero.setDefense(hero.getDefense()-defenseBonus); break; }
		case 방어구:{ hero.setDefense(hero.getDefense()-defenseBonus); break; }
		}
	}
	public void 장착(용사 hero,아이템아이디 id)
	{
		if (장착여부반환()) 해제(hero,id);
		
	}
	public boolean 장착여부반환() { return equipped; }
	public int 공격력보너스반환() { return attackBonus; }
	public int 방어력보너스반환() { return defenseBonus; }
}
