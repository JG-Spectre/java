package 김준연;

import java.util.Scanner;

public class IntegerTotime {
	public static void main(String[] args)
	{
		System.out.println("숫자 입력 >>");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		int hour=i/3600;
		int remain=i%3600;
		int minute=remain/60;
		int second=remain%60;
		System.out.println(hour+"h "+minute+"m " +second+"s");
	}
}
