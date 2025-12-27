package 김준연;

import java.util.Scanner;

public class SeatReservation {
	public static void main(String[] args) {
		boolean[][] seats=new boolean[10][5];
		char menuChar;
		for(int r=0;r<seats.length;r++)
			for(int c=0;c<seats[r].length;c++)
				seats[r][c]=false;
		do
		{
			System.out.println("s : 예약 현황");
			System.out.println("r : 예약");
			System.out.println("c : 예약 취소");
			System.out.println("e : 프로그램 종료");
			
			System.out.print("원하는 메뉴 글자 (s,r,c,e) : ");
			Scanner sc=new Scanner(System.in);
			menuChar = sc.next().charAt(0);
			
			switch(menuChar)
			{
			case 's':showReservationStatus(seats);
			break;
			case 'r':reserveSeat(seats);
			break;
			case 'c':cancelReservation(seats);
			break;
			case 'e':System.out.println("시스템 종료");
			return;
			}
		}
		while(true);
	}

	private static void cancelReservation(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.print("취소하고 싶은 좌석의 행(1-10) 열(1-5) 입력 (예 : 5 3) : ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		if(row>=1&&row<=10&&col>=1&&col<=5)
		{
			if(seats[row][col]==true)
				seats[row][col]=false;
			else
				System.out.println("예약되지 않은 자리");
		}
		else
			System.out.println("좌석 행 또는 열이 잘못됨");
	}

	private static void reserveSeat(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.print("원하는 좌석 행(1-10) 열(1-5) 입력 (예 : 5 3) : ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		if (row>=1&&row<=10&&col>=1&&col<=5)
		{
			if (seats[row][col]!=true)
				seats[row][col]=true;
			else
				System.out.println("이미 예약된 자리입니다.");
		}
		else
			System.out.println("좌석 행 또는 열이 잘못됨");
	}

	private static void showReservationStatus(boolean[][] seats) {
		// TODO Auto-generated method stub
		System.out.println("예약 가능한 자리 : o");
		for (int r=0;r<seats.length;r++)
		{
			for(int c=0;c<seats[r].length;c++)
			{
				if(seats[r][c]==true)
					System.out.print("x ");
				else
					System.out.print("o ");
			}
			System.out.println();
		}
	}
	
}
