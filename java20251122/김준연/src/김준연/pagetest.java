package 김준연;

import java.util.Random;

public class pagetest {
	public static void main(String[] args) {
		
		int x=15;
		if (x>10&&x<20)
			System.out.println("[1-1] 1.");
		
		char ch1='a';
		if(ch1!=' '&&ch1!='\t')
			System.out.println("[1-1] 2.");
		
		char ch2='x';
		if(ch2=='x'||ch2=='X')
			System.out.println("[1-1] 3.");
		
		char ch3='5';
		if(ch3>='0'&&ch3<='9')
			System.out.println("[1-1] 4.");
		
		char ch4='F';
		if((ch4>='A'&&ch4<='Z')||(ch4>='a'&&ch4<='z'))
			System.out.println("[1-1] 5.");
		
		int year=120;
		if(year%400==0||(year%40==0&&year%100!=0))
			System.out.println("[1-1] 6.");
		
		boolean powerOn=false;
		if(!powerOn)
			System.out.println("[1-1] 7.");
		
		String str = new String("yes");
		if(str.equals("yes"))
			System.out.println("[1-1] 8.");
		
		int tot1=0;
		for(int i=1;i<21;i++)
		{
			if(i%3!=0&&i%2!=0)
				tot1+=i;
		}
		System.out.println(tot1);
		
		int tot2=0;
		int sum=0;
		for(int j=1;j<=10;j++)
		{
			sum += j;
			tot2+=sum;
		}
		System.out.println(tot2);
		
		int val=0;
		int add=1;
		int delta = 1;
		while(val<100)
		{
			val+=add * delta;
			delta = -delta;
			if(val>=100)
				break;
			add++;
		}
		System.out.println(add);
		
		for(int o=1;o<=6;o++)
		{
			for(int p=1;p<=6;p++)
			{
				if(o+p==6)
					System.out.println(o+"+"+p+"= 6");
			}
		}
		
		int star=0;
		while(star<10)
		{
			int starsecond=0;
			while(starsecond<=star)
			{
				System.out.print("*");
				starsecond++;
			}
			System.out.println();
			star++;
		}
	}
}
