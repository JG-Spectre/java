package 용사키우기;

import java.util.Scanner;

public class 용사키우기 {
	public static void main(String[] args) {
		용사키우기 starter = new 용사키우기();
		starter.start();
	}
	void start()
	{
		용사 hero = new 용사("용사",100,10,5);
		Scanner sc = new Scanner(System.in);
		
//		try
//		{
			introduction(hero.이름반환());
			hero.상태출력();
			while (true)
			{
				System.out.println();
				System.out.print("이제 뭘 해야될까?\n1. 토벌\n2. 상점\n3. 단련\n4. 인벤토리\n5. 프로필\n6. 포기\n>>");
				int main_choice = sc.nextInt();
				switch(main_choice)
				{
				case 1:hero.토벌();break;
				}
			}
//		}
//		catch(게임오버Exception e)
//		{
//			System.out.println("게임 오버");
//			System.out.println(e.getMessage());
//		}
//		finally
//		{
//			sc.close();
//		}
	}
	void introduction(String heroname)
	{
		System.out.println("때는 마계가 지구와 공존하던 시절.");
		System.out.println("클레멘스의 일반 시민 "+heroname+".");
		System.out.println("배가 고파서 전에 사둔 푸딩을 먹으려 하는데...");
		System.out.println("아니글쎄 푸딩이 사라진 것이다!");
		System.out.println("그리고 놓여있는 쪽지 한장.");
		System.out.println("\"잘 먹고감 ㅋ\" -마왕");
		System.out.println("그렇게 용사는 모험을 시작하게 된다...");
		System.out.println();
	}
}
