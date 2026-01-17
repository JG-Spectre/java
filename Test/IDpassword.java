package Test;

import java.util.Scanner;

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
				signup(ids, pws, count);
				break;
			case "exit":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

	private static void signup(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		String inputid;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("아이디 입력\n(뒤로 가려면 exit 입력)\n>>");
			inputid = sc.nextLine();
			boolean existing = false;
			if (inputid.equals("exit"))
				return;
			for (int i = 0; i < count; i++)
				if (inputid.equals(ids[count])) {
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
			return;
		count+=1;
		ids[count] = inputid;
		pws[count] = inputpw;
		System.out.println("회원가입이 완료되었습니다.");

	}

	private static void login(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		int accountnumber;
	}
}
