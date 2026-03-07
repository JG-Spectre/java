package 김준연;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	private static String getString(String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=null;
		Pattern pattern;
		Matcher m;
		
		while(true)
		{
			System.out.print(s1);
			input=sc.nextLine();
			pattern=Pattern.compile(s2);
			m=pattern.matcher(input);
			if(!m.matches())
			{
				System.out.println(s3);
				continue;
			}
			break;
		}
		
		return input;
	}
	
	
	public static void main(String[] args) {
		String birth = getString("생년월일(YYYYMMDD)\n>>", "^[1-2][0-9]{3}[01][0-9][0-3][0-9]$", "생년월일 형식 불일치");	
		String name = getString("이름\n>>", "^[가-힣]{2,4}$", "이름 형식 불일치");
		String address = getString("주소\n>>", "^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}로\\s+\\d{2,4}$", "주소 형식 불일치");
		String mail = getString("우편번호\n>>", "^\\d{5}$", "우편번호 형식 불일치");
		String phone = getString("휴대폰 번호\n>>", "^01[01]-\\d{4}-\\d{4}$", "휴대폰 번호 형식 불일치");
		String blood = getString("혈액형\n>>", "^[ABO]{1,2}$", "혈액형 형식 불일치");
		String mbti = getString("MBTI\n>>", "^[IE][NS][FT][PJ]$", "MBTI 형식 불일치");
		
//		Scanner sc=new Scanner(System.in);
//		String input;
//		Pattern pattern;
//		Matcher m;
//		
//		System.out.print("이름\n>>");
//		input=sc.nextLine();
//		pattern=Pattern.compile("^[가-힣]{2,4}$");
//		m=pattern.matcher(input);
//		if(!m.matches())
//		{
//			System.out.println("이름 형식 불일치");
//			return;
//		}
//		
//		System.out.print("주소\n>>");
//		input=sc.nextLine();
//		pattern=Pattern.compile("^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}로\\s+\\d{2,4}$");
//		m=pattern.matcher(input);
//		if(!m.matches())
//		{
//			System.out.println("주소 형식 불일치");
//			return;
//		}
//		System.out.print("우편번호\n>>");
//		input=sc.next();
//		pattern=Pattern.compile("^\\d{5}$");
//		m=pattern.matcher(input);
//		if(!m.matches())
//		{
//			System.out.println("우편번호 형식 불일치");
//		}
//		System.out.print("핸드폰 번호\n>>");
//		input=sc.next();
//		pattern=Pattern.compile("^01[01]-\\d{4}-\\d{4}");
//		m=pattern.matcher(input);
//		if(!m.matches())
//		{
//			System.out.println("핸드폰 번호 형식 불일치");
//			return;
//		}
		System.out.println("모든 자료 입력 완료");
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("우편번호 : "+mail);
		System.out.println("휴대폰 번호 : "+phone);
		System.out.println("혈액형 : "+blood);
		
		System.out.println("MBTI : "+mbti);
		System.out.println("생년월일 : "+birth);
	}

}
