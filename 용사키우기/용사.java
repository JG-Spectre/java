package 용사키우기;

import java.util.ArrayList;
import java.util.List;

public class 용사 {
	private String name; private int level; private int hp; private int maxhp; private int attack; private int defense; private int stage;
	private final List<아이템> inventory = new ArrayList<>();
	public 용사(String name,int maxHp, int attack,int defense) { this.name = name; this.level = 1; this.maxhp = maxHp; this.hp = maxHp; this.attack = attack; this.defense = defense; }
	public void 아이템추가(아이템 item) { inventory.add(item); }
	public void 아이템사용(아이템 item)
	{
		
	}
	public void 데미지받기(int damage) throws 게임오버Exception { hp -= damage; }
	public void 상태출력() { System.out.printf("[%s] Lv.%d HP:%d/%d ATK:%d DEF:%d%n",name,level,hp,maxhp,attack,defense); }
	public String 이름반환() { return name; }
	public int 체력반환() { return hp; }
	public int 단계반환() { return stage; }
	public List<아이템> 인벤토리반환() { return inventory; }
	public void 토벌() {
		System.out.println();
		System.out.println("무엇이든 천천히 하는 것이 중요하다.\n토벌을 시작할까?");
		
	}
}
