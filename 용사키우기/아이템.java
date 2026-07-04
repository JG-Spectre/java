package 용사키우기;

public abstract class 아이템 {
	protected final 아이템아이디 id;
	protected 아이템(아이템아이디 id) { this.id = id; }
	public 아이템아이디 아이템반환()
	{
		return id;
	}
	public String 이름반환()
	{
		return id.표시이름반환();
	}
	public abstract void 사용(용사 hero);
	
	@Override
	public String toString()
	{
		return "["+id.표시이름반환()+"] "+id.설명반환();
	}
}
