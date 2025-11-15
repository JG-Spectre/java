package 김준연;

public class p36_Assignment {
	public static void main(String[] args)
	{
		char c = '한';
		System.out.println("문자 : " + c);
		int code = c;
		System.out.println("유니코드 : " + Integer.toHexString(code));
		int i = 0xd55c;
		char c2 = (char)i;
		System.out.println("문자 : " + c2);
	}
}
