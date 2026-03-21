package 김준연;

import java.util.Scanner;

public class DiceGame {

	private int diceFace;
	private int userGuess;
	private void RollDice()
	{
		diceFace=(int)(Math.random()*6)+1;
	}
	private int getUserInput(String prompt)
	{
		int r;
		System.out.println(prompt);
		Scanner inp=new Scanner(System.in);
		r=inp.nextInt();
		return r;
	}
	private void checkUserGuess()
	{
		if(diceFace==userGuess)
			System.out.println("일치");
		else
			System.out.println("불일치");
	}
	public void startPlaying()
	{
		userGuess=getUserInput("예상 값 입력 : ");
		RollDice();
		checkUserGuess();
	}
	
	public static void main(String[] args) {
		
	}
}
