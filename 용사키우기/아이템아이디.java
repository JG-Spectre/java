package 용사키우기;

public enum 아이템아이디 {
	WOODEN_SWORD("나무 검","기본적이지만 충분히 든든한 검"),
	IRON_SWORD("철 검","단단한 재질로 만들어져 아무리 휘둘러도 끄떡없는 검"),
	IRON_SHIELD("철 방패","방패지만 강력해 충분히 무기로도 쓰고 방어도 가능한 무기"),
	WOODEN_SPEAR("나무 창","쉴드랑 방어력을 뚫고 피해를 입히는 창"),
	
	LEATHER_ARMOR("가죽 갑옷","충분히 질긴 가죽으로 만들어져 없는것보다 나은 갑옷"),
	IRON_PLATE("철 갑옷 플레이트","가죽 갑옷이지만 철 판이 붙어 쉴드 게이지를 올려주는 갑옷"),
	IRON_ARMOR("철 갑옷","완전히 철로 덮여 방어력을 월등히 올려주는 갑옷"),
	STEEL_PLATE("강철 갑옷 플레이트","철 갑옷 안에 강철 플레이트를 넣어 창도 막아내는 갑옷"),
	
	HEALTH_POTION("회복 물약","사용 시 체력 +50"),
	STRENGTH_POTION("힘 물약","사용 후 다음 3턴동안 피해 +5"),
	SHIELD_POTION("쉴드 물약","사용 시 쉴드 +20 (쉴드 수치는 최대 쉴드를 뛰어넘을 수 있음)"),
	DEFENSE_POTION("방어력 물약","사용 후 다음 3턴동안 방어력 +5")
	;
	private final String displayName;
	private final String description;
	아이템아이디(String display, String desc) { this.displayName = display; this.description = desc; }
	public String 표시이름반환() {
		return displayName;
	}
	public String 설명반환() {
		return description;
	}
}
