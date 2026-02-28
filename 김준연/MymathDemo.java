package 김준연;

import java.util.Scanner;

public class MymathDemo {

	public static void main(String[] args) {
		System.out.print("반지름 입력\n>>");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		System.out.print("원의 둘레 : "+MyMath.getCirclePerimeter(r));
		System.out.println("원의 면적 :"+MyMath.getCircleArea(r));
		System.out.print("마일 입력\n>>");
		r=sc.nextDouble();
		System.out.println(MyMath.mileToKilometer(r)+"킬로미터와 같음");
		System.out.print("킬로미터 입력\n>>");
		r=sc.nextDouble();
		System.out.println(MyMath.kilometerToMile(r)+"마일과 같음");
	}
}
class MyMath
{
	static final double PI=3.141592;
	static final double KMPerMILE=1.609344;
	static double getCirclePerimeter(double r)
	{
		return 2*PI*r;
	}
	static double getCircleArea(double r)
	{
		return PI*r*r;
	}
	static double kilometerToMile(double km)
	{
		return km*1/KMPerMILE;
	}
	static double mileToKilometer(double m)
	{
		return m*KMPerMILE;
	}
}
