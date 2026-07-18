package 용사키우기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 용사 {
	private String name; private int level; private int hp; private int maxhp; private int shield; private int maxshield; private int attack; private int defense; private int stage; private int coin;
	private final List<아이템> inventory = new ArrayList<>();
	public 용사(String name,int maxHp, int shield, int attack,int defense) { this.name = name; this.level = 1; this.maxhp = maxHp; this.hp = maxHp; this.shield=shield; this.attack = attack; this.defense = defense; }
	public void 아이템추가(아이템 item) { inventory.add(item); }
	public void 아이템사용(아이템 item) {
		
	}
	public void 데미지받기(int damage) throws 게임오버Exception { hp -= damage; }
	public void 상태출력() { System.out.printf("[%s] Lv.%d HP:%d/%d SHIELD:%d ATK:%d DEF:%d%n",name,level,hp,maxhp,maxshield,attack,defense); }
	public String 이름반환() { return name; }
	public int 체력반환() { return hp; }
	public int 단계반환() { return stage; }
	public int 코인반환() { return coin; }
	public List<아이템> 인벤토리반환() { return inventory; }
	
	public void 토벌() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("무엇이든 천천히 하는 것이 중요하다.\n토벌을 시작할까? (현재 토벌 지역 : ");
		switch(단계반환()) {
		case 1:System.out.print("고블린 동굴");break;
		case 2:System.out.print("울창한 숲");break;
		case 3:System.out.print("산적 전초기지");break;
		case 4:System.out.print("파괴된 도시");break;
		case 5:System.out.print("마법이 깃든 숲");break;
		case 6:System.out.print("마계 초원");break;
		case 7:System.out.print("마왕성");break;
		}
		System.out.print(")\n1. 가자!\n2. 이전 지역 소탕 (이전 소탕 지역 : ");
		switch(단계반환()) {
		case 1:System.out.print("없음");break;
		case 2:System.out.print("고블린 동굴");break;
		case 3:System.out.print("울창한 숲");break;
		case 4:System.out.print("산적 전초기지");break;
		case 5:System.out.print("파괴된 도시");break;
		case 6:System.out.print("마법이 깃든 숲");break;
		case 7:System.out.print("마계 초원");break;
		}
		System.out.print(")\n3. 뒤로\n>>");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:	{
				switch(단계반환()) {
				case 1:토벌_고블린동굴(true);break;
				case 2:토벌_울창한숲(true);break;
				case 3:토벌_산적전초기지(true);break;
				case 4:토벌_파괴된도시(true);break;
				case 5:토벌_마법이깃든숲(true);break;
				case 6:토벌_마계초원(true);break;
				case 7:토벌_마왕성();break;
				}
			}
			case 2:	{
				switch(단계반환()) {
				case 1:System.out.println("이전 단계? 내가 뭐, 이 마을이라도 토벌해야되나?");break;
				case 2:토벌_고블린동굴(false);break;
				case 3:토벌_울창한숲(false);break;
				case 4:토벌_산적전초기지(false);break;
				case 5:토벌_파괴된도시(false);break;
				case 6:토벌_마법이깃든숲(false);break;
				case 7:토벌_마계초원(false);break;
				}
			}
		}
	}
	private void 토벌_고블린동굴(boolean isNew) {
		
	}
	private void 토벌_울창한숲(boolean isNew) {
		
	}
	private void 토벌_산적전초기지(boolean isNew) {
		
	}
	private void 토벌_파괴된도시(boolean isNew) {
	
	}
	private void 토벌_마법이깃든숲(boolean isNew) {
	
	}
	private void 토벌_마계초원(boolean isNew) {
	
	}
	private void 토벌_마왕성() {
	
	}
	public void 상점() {
		System.out.println("\n상점이다. 어떤걸 구매해볼까? (잔액 : "+코인반환()+"코인)");
		
		아이템아이디 목록;
		목록.표시이름반환();
	}
	public void 단련() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\n단련장이다. 어떤걸 단련해볼까? (잔액 : "+코인반환()+"코인, 모든 단련은 100코인을 소모한다.)\n1. 체력 단련\n2. 공격력 단련\n3. 방어력 단련\n4. 뒤로\n>>");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: {
					if (코인반환() >= 100)
					{
						if(hp == maxhp)
							hp+=5;
						maxhp+=5;
						coin-=100;
						System.out.println("체력 단련 완료\n최대체력이 5 증가했다.\n");
					}
					else
						System.out.println("단련하기엔 잔액이 부족하다.");
					break;
				}
				case 2: {
					if (코인반환() >= 100)
					{
						attack+=1;
						coin-=100;
						System.out.println("공격력 단련 완료\n공격력이 1 증가했다.\n");
					}
					else
						System.out.println("단련하기엔 잔액이 부족하다.");
					break;
				}
				case 3: {
					if (코인반환() >= 100)
					{
						defense+=1;
						coin-=100;
						System.out.println("방어력 단련 완료\n방어력이 1 증가했다.\n");
					}
					else
						System.out.println("단련하기엔 잔액이 부족하다.");
					break;
				}
				case 4: {
					System.out.println("단련장을 나왔다.");
					return;
				}
			}
		}
	}
	public void 인벤토리() {
		인벤토리반환();
		//아이템 사용 및 착용 여부
		
	}
	public void 프로필() {
		System.out.println("\n이게 나다.");
		상태출력();
	}
}
