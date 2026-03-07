package 김준연;

import java.util.Scanner;

public class IDpassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디\n>>");
		String id=sc.next();
		System.out.print("비밀번호\n>>");
		String pw=sc.next();
		id=id.trim();
		pw=pw.trim();
		id=id.toLowerCase();
		pw=pw.toLowerCase();
		if(id.equals("spectre"))
		{
			if(pw.equals("passwordbutyknowthisisnotevenrealpasswordk?"))
				System.out.println("로그인 완료");
			else
				System.out.println("비밀번호 불일치");
		}
		else
			System.out.println("존재하지 않는 아이디");
	}
}
