package 용사키우기;

public enum 아이템아이디 {
	WOODEN_SWORD("나무 검","공격력을 올려주는 기본 검"),
	LEATHER_ARMO("가죽 갑옷","방어력을 올려주는 기본 갑옷"),
	HEALTH_POTION("회복 물약","체력을 회복시키는 물약")
	
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
