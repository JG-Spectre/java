package 김준연;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(">>");
		int a=sc.nextInt();
		System.out.println(">>");
		int b=sc.nextInt();
		System.out.println("a = +, s = -, m = *, d = /");
		char c=sc.next().charAt(0);
		sc.close();
		double result;
		if (c=='a') result = a+b;
		else if (c=='s') result = a-b;
		else if (c=='m') result = a*b;
		else if (c=='d') result = a/b;
		else
		{
			System.out.println("Requested character is not supported");
			return;
		}
		System.out.println(result);
	}
}
