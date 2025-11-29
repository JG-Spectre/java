package 김준연;

import java.util.Scanner;

public class Meadian {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(">>");
		int s1=sc.nextInt();
		System.out.println(">>");
		int s2=sc.nextInt();
		System.out.println(">>");
		int s3=sc.nextInt();
		sc.close();
		int meadianVal;
		if(s1>s2)
		{
			if(s2>s3)
				meadianVal=s2;
			else if(s1>s3)
				meadianVal=s3;
			else
				meadianVal=s1;
		}
		else
		{
			if(s1>s3)
				meadianVal=s1;
			else if(s2>s3)
				meadianVal=s3;
			else
				meadianVal=s2;
		}
		System.out.println(meadianVal);
	}
}
