package 김준연;

import java.util.Scanner;

public class DiceGame {

	private int RollDice()
	{
		return (int)(Math.random()*6)+1;
	}
	private int getUserInput(String prompt)
	{
		int r;
		System.out.print(prompt);
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		return r;
	}
	private boolean checkUserGuess(int face, int guess)
	{
		if(face==guess)
		{
			System.out.print("일치 ");
			return true;
		}
		else
		{
			System.out.println("불일치");
			return false;
		}
	}
	public void startPlaying()
	{
		int diceFace = RollDice();
		int attempts = 1;
		while (true)
		{
			int userGuess=getUserInput("예상 값 입력 : ");
			if (checkUserGuess(diceFace,userGuess))
			{
				System.out.println(attempts+"회 시도");
				return;
			}
			else
				attempts++;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DiceGame game=new DiceGame();
		game.startPlaying();
		while (true)
		{
			System.out.println("다시 시작하시겠습니까? (진행하려면 y)");
			String yes = sc.nextLine();
			if (yes.matches("y"))
				game.startPlaying();
			else
				break;
		}
		System.out.println("게임 종료");
	}
}