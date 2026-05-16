package printTest;

import java.util.Scanner;

public class SoccerTeamManager {
	
	Scanner sc=new Scanner(System.in);
	구단[] 구단s = new 구단[100];
	int 구단count=0;
	
	
	
	void start()
	{
		while (true)
		{
			System.out.print("<축구구단 관리 프로그램>\n1. 구단 추가\n2. 구단 편집\n3. 구단 삭제\n4. 구단 보기\n5. 프로그램 종료\n>>");
			int select=sc.nextInt();
			switch (select)
			{
			case 1: 구단추가(); break;
			case 2: 구단편집(); break;
			case 3:  break;
			case 4: 구단보기(); break;
			case 5:  break;
			default:System.out.println("올바르지 않은 값입니다.");
			}
		}
	}
	public static void main(String[] args) {
		SoccerTeamManager starter = new SoccerTeamManager();
		starter.start();
	}
	
	void 구단추가()
	{
		System.out.print("<<구단 추가>>\n구단 이름 입력\n>>");
		String newTeam = sc.nextLine();
		구단s[구단count] = new 구단(newTeam);
		구단count++;
		System.out.println(">구단이 생성되었습니다.");
	}
	void 구단편집()
	{
		while (true)
		{
			System.out.println("<<구단편집>>"); for(int i=0;i<구단count;i++) System.out.println(i+1+". "+구단s[i].get구단명()); System.out.print(구단count+1+". 나가기\n>>");
			int choice = sc.nextInt();
			if (choice == 구단count+1) break;
			else if (!(choice >= 0 && choice <= 구단count+1)) {System.out.println("올바르지 않은 값입니다."); continue;}
			구단s[choice-1].start();
		}
	}
	void 구단보기()
	{
		System.out.println("<<구단 보기>>");
		for (int i=0;i<구단count;i++)
		{
			
		}
	}
}

class 구단
{
	private String 구단명; 선수[] 선수s = new 선수[100]; int 선수count = 0; private String 코치;
	public String get구단명() {return 구단명;} public void set구단명(String 구단명) {this.구단명 = 구단명;} public String get코치() {return 코치;} public void set코치(String 코치) {this.코치 = 코치;}
	public 구단(String 구단명) {this.구단명 = 구단명;}
	Scanner sc=new Scanner(System.in);
	
	public void start() {
		while (true)
		{
			System.out.print("<<"+get구단명()+" 편집>>\n1. 코치 추가\n2. 선수 추가\n3. 코치 제거\n4. 선수 제거\n5. 나가기\n>>");
			int select=sc.nextInt();
			switch (select)
			{
			case 1: 코치추가(); break;
			case 2: 선수추가(); break;
			case 3:  break;
			case 4:  break;
			case 5:  break;
			default:System.out.println("올바르지 않은 값입니다.");
			}
		}
	}
	void 코치추가()
	{
		System.out.print("<<코치 추가>>\n코치 이름 입력\n>>");
		String newCoach = sc.nextLine();
		set코치(newCoach);
		System.out.println(">"+newCoach+"이(가) 추가되었습니다.");
	}
	void 선수추가()
	{
		System.out.println("<<선수 추가>>");
		System.out.print("선수 이름 입력\n>>");
		String newPlayer = sc.nextLine();
		System.out.print(newPlayer+" 선수의 연봉 입력\n>>");
		int newMoney = sc.nextInt();
		선수s[선수count] = new 선수(newPlayer,newMoney);
		선수count++;
		System.out.println(">"+newPlayer+"이(가) 추가되었습니다. (연봉 : "+newMoney+"만원)");
	}
	void 선수보기()
	{
		for (int j=0;j<선수count;j++)
		{
			
		}
	}
}

class 선수
{
	private String 선수명; private int 연봉;
	public String get선수명() {return 선수명;} public void set선수명(String 선수명) {this.선수명 = 선수명;} public int get연봉() {return 연봉;} public void set연봉(int 연봉) {this.연봉 = 연봉;}
	public 선수(String 선수명, int 연봉) {this.선수명 = 선수명;this.연봉 = 연봉;}
}