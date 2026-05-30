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
			System.out.print("<축구구단 관리 프로그램>\n1. 구단 추가\n2. 구단 편집\n3. 구단 제거\n4. 구단 보기\n5. 프로그램 종료\n>>");
			int select=sc.nextInt();
			sc.nextLine();
			switch (select)
			{
			case 1: 구단추가(); break;
			case 2: 구단편집(); break;
			case 3: 구단제거(); break;
			case 4: 구단보기(); break;
			case 5: return;
			default:System.out.println("올바르지 않은 값입니다.");
			}
		}
	}
	public static void main(String[] args) {
		SoccerTeamManager starter = new SoccerTeamManager();
		starter.start();
		System.out.println("프로그램 종료");
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
	void 구단제거()
	{
		while (true)
		{
			System.out.println("제거하고싶은 선수의 번호를 입력해주세요.");
			for (int i=0;i<구단count;i++) System.out.println(i+1+". "+구단s[i].get구단명()); System.out.println(구단count+1+". 취소");
			int choice = sc.nextInt();
			if (choice == 구단count+1) break;
			else if (!(choice >= 0 && choice <= 구단count+1)) {System.out.println("올바르지 않은 값입니다."); continue;}
			
			String name = 구단s[choice-1].구단명잘라내기();
			for (int j=choice-1;j<구단count;j++) 구단s[j] = 구단s[j+1]; 구단s[구단count] = null; 구단count--;
			System.out.println(name+" 구단이 제거되었습니다.");
		}
	}
	void 구단보기()
	{
		System.out.println("<<구단 보기>>\n");
		for (int i=0;i<구단count;i++)
		{
			System.out.println("<<"+구단s[i].get구단명()+">>");
			구단s[i].구단정보();
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
			System.out.print("\n<<"+get구단명()+" 편집>>\n1. 코치 추가\n2. 선수 추가\n3. 코치 제거\n4. 선수 제거\n5. 나가기\n>>");
			int select=sc.nextInt();
			sc.nextLine();
			switch (select)
			{
			case 1: 코치추가(); break;
			case 2: 선수추가(); break;
			case 3: 코치제거(); break;
			case 4: 선수제거(); break;
			case 5: return;
			default:System.out.println("올바르지 않은 값입니다.");
			}
		}
	}
	void 코치추가()
	{
		System.out.print("<<코치 추가>>\n코치 이름 입력\n>>"); String newCoach = sc.nextLine();
		set코치(newCoach); System.out.println(">"+newCoach+" 코치가 추가되었습니다.");
	}
	void 선수추가()
	{
		System.out.println("<<선수 추가>>");
		System.out.print("선수 이름 입력\n>>"); String newPlayer = sc.nextLine();
		System.out.print(newPlayer+" 선수의 연봉 입력\n>>"); int newMoney = sc.nextInt();
		선수s[선수count] = new 선수(newPlayer,newMoney); 선수count++; System.out.println(">"+newPlayer+"이(가) 추가되었습니다. (연봉 : "+newMoney+"만원)");
	}
	void 코치제거()
	{
		while (true)
		{
			System.out.print(get코치()+" 코치를 제거하시겠습니까? (제거하려면 '예', 취소하려면 '아니오')\n>>");
			String choose = sc.nextLine();
			if (choose.equals("예")) { 
				String name = get코치();
				set코치(null); 
				System.out.println(">"+name+" 코치가 구단에서 제거되었습니다.");
				return;
			}
			else if (choose.equals("아니오"))
			{
				System.out.println("코치 제거를 취소하였습니다.");
				return;
			}
			else
				System.out.println("예 또는 아니오 중에서 입력해주세요.");
		}
	}
	void 선수제거()
	{
		while (true)
		{
			System.out.println("제거하고싶은 선수의 번호를 입력해주세요.");
			for (int i=0;i<선수count;i++) System.out.println(i+1+". "+선수s[i].get선수명()); System.out.println(선수count+1+". 취소");
			int choice = sc.nextInt();
			if (choice == 선수count+1) break;
			else if (!(choice >= 0 && choice <= 선수count+1)) {System.out.println("올바르지 않은 값입니다."); continue;}
			String name = 선수s[choice-1].선수명잘라내기();
			for (int j=choice-1;j<선수count;j++) 선수s[j] = 선수s[j+1]; 선수s[선수count] = null; 선수count--;
			System.out.println(">"+get구단명()+" 구단의 "+name+" 선수가 제거되었습니다.");
			break;
		}
	}
	void 구단정보()
	{
		if (코치 != null)
			System.out.println(" 코치 : "+코치);
		else
			System.out.println(" 코치 : 없음");
		System.out.println(" "+get구단명()+"의 선수");
		for (int j=0;j<선수count;j++)
		{
			System.out.println(선수s[j]);
			//System.out.println("  > "+선수s[j].get선수명()+" (연봉 : "+선수s[j].get연봉()+"만원)");
		}
		System.out.println();
	}
	String 구단명잘라내기()
	{ 
		for (int i=0;i<선수count;i++)
		{
			선수s[i].선수명잘라내기();
		}
		String name = get구단명(); set구단명(null); return name;
	}
}

class 선수
{
	private String 선수명; private int 연봉;
	public String get선수명() {return 선수명;} public void set선수명(String 선수명) {this.선수명 = 선수명;} public int get연봉() {return 연봉;} public void set연봉(int 연봉) {this.연봉 = 연봉;}
	public 선수(String 선수명, int 연봉) {this.선수명 = 선수명;this.연봉 = 연봉;}
	String 선수명잘라내기() { String name = get선수명(); set선수명(null); return name; }
	
	@Override
	public String toString()
	{
		return "  "+get선수명()+" (연봉 : "+get연봉()+"만원)";
	}
}