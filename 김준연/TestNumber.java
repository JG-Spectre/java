package 김준연;

public class TestNumber {
	public static void main(String[] args) {
		String regExp="01[078]-\\d{4}-\\d{4}";
		String Str=new String("010-5182-0173");
		System.out.println(Str.matches(regExp));
		Str=new String("013-5182-0173");
		System.out.println(Str.matches(regExp));
		Str=new String("013-518-0173");
		System.out.println(Str.matches(regExp));
	}
}
