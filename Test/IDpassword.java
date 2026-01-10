package Test;

import java.util.Scanner;

public class IDpassword {
	public static void main(String[] args) {
		String[] ids = new String[100];
		String[] pws = new String[100];
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("명령 입력\nlogin << 로그인\nsignup << 회원가입\nexit << 프로그램 종료\n>>");
			String chose=sc.nextLine();
			switch(chose)
			{
			case "login":
				login(ids,pws,count);
				break;
			case "signup":
				signup(ids,pws,count);
				break;
			case "exit":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

	private static void signup(String[] ids,String[] pws,int count) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("아이디 입력\n(뒤로 가려면 exit 입력)\n>>");
			String inputid=sc.nextLine();
			if(count>0)
				for(int i=0;i<count;i++)
				{
					if(inputid.equals(ids[count]))
						System.out.println("이미 존재하는 아이디입니다.\n");
					
				}
		}
		
			
	}

	private static void login(String[] ids,String[] pws,int count) {
		// TODO Auto-generated method stub
		int accountnumber;
	}
}
