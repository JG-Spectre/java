package 김준연;

import java.util.Scanner;

public class SumNAvg {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("첫번째 성적 >> ");
		int s1 = sc.nextInt();
		System.out.println("두번째 성적 >> ");
		int s2=sc.nextInt();
		System.out.println("세번째 성적 >> ");
		int s3=sc.nextInt();
		int sum=s1+s2+s3;
		double avg=sum/3.0;
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
