package Test;

import java.util.Scanner;

import 김준연.SeatReservation;

public class IDpassword {
	
	public static void main(String[] args) {
		String[] ids = new String[100];
		String[] pws = new String[100];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("명령 입력\nlogin << 로그인\nsignup << 회원가입\nexit << 프로그램 종료\n>>");
			String chose = sc.nextLine();
			switch (chose) {
			case "login":
				login(ids, pws, count);
				break;
			case "signup":
				count = signup(ids, pws, count);
				break;
			case "exit":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

	private static int signup(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		String inputid;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("아이디 입력\n(뒤로 가려면 back 입력)\n>>");
			inputid = sc.nextLine();
			if (inputid.equals("back"))
				return count;
			boolean existing = false;
			for (int i = 0; i < count; i++)
				if (inputid.equals(ids[i])) {
					existing = true;
					break;
				}
			if (existing == true) {
				System.out.println("이미 존재하는 아이디입니다.\n");
				continue;
			}
			break;
		}
		System.out.print("비밀번호 입력(뒤로 가려면 back 입력)\n>>");
		String inputpw = sc.nextLine();
		if (inputpw.equals("back"))
			return count;
		ids[count] = inputid;
		pws[count] = inputpw;
		System.out.println("회원가입이 완료되었습니다.");
		count++;
		return count;
	}

	private static void login(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		String inputid;
		String inputpw;
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.print("아이디 입력(뒤로 가려면 back 입력)\n>>");
			inputid=sc.nextLine();
			if(inputid.equals("back"))
				return;
			System.out.print("비밀번호 입력(뒤로 가려면 back 입력)\n>>");
			inputpw=sc.nextLine();
			if(inputpw.equals("back"))
				return;
			int existing=0;
			for(int i=0;i<count;i++)
			{
				if(inputid.equals(ids[i]))
				{		
					if(inputpw.equals(pws[i]))
						existing=1;
					else
						existing=2;
					break;
				}	
			}
			if (existing==0)
				System.out.println("존재하지 않는 아이디입니다.\n");
			if (existing==1) {
				System.out.println("로그인되었습니다. 환영합니다.");
				SeatReservation.main(null);
			}
			if (existing==2)
				System.out.println("비밀번호가 일치하지 않습니다.\n");
			return;
		}
	}
}
