package 김준연;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("X Pos >>");
		int x=sc.nextInt();
		System.out.println("Y Pos >>");
		int y=sc.nextInt();
		sc.close();
		int qud;
		if (x==0 || y==0)
		{
			System.out.println("Cannot define area if one of x or y pos is 0");
			return;
		}
		if(x>0)
		{
			if (y>0)
				qud=1;
			else
				qud=4;
		}
		else
		{
			if (y>0)
				qud=2;
			else
				qud=3;
		}
		System.out.println(qud);
	}
}
