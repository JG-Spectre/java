package 김준연;

import java.util.Random;

class SharedData
{
	private static int count=0;
	public final static int MaxSize=100;
	private static int[] buffer=new int[MaxSize];
	public static int getVal()
	{
		if(count!=0)//30 36
			return buffer[--count];//31 37
		else//31 37
			return -1;//32 38
	}
	public static int setVal(int s)
	{
		if(count!=MaxSize)//10 19
		{
			buffer[count++]=s;//11 20
			return count;//12 21
		}
		else//11 20
			return -1;//12 21
	}
}

class Producer
{
	private Random generator=new Random();
	public void produce()
	{
		int loop=generator.nextInt(4)+2;//5
		int res,val;//6
		for(int i=0;i<loop;i++)//7 16
		{
			val=generator.nextInt(101);//8 17
			res=SharedData.setVal(val);//9 18
			if(res<0)//13 22
				System.out.println("write : 버퍼가 꽉 차 데이터를 추가할 수 없습니다.");//14 23
			else//14 23
				System.out.println("write : "+val);//15 24 
		}
	}
}

class Consumer
{
	private Random generator=new Random();
	public void consume()
	{
		int loop=generator.nextInt(4)+2;//26
		int res;//27
		for(int i=0;i<loop;i++)//28 34
		{
			res=SharedData.getVal();//29 35
			if(res<0)//32 38
				System.out.println("read : 데이터가 없습니다.");//33 39
			else//33 39
				System.out.println("read : "+res);//34 40
		}
	}
}

public class p214_SharedTest {

	public static void main(String[] args) {
		Consumer c=new Consumer();//1
		Producer p=new Producer();//2
		for(int i=0;i<3;i++)//3
		{
			p.produce();//4
			c.consume();//25
		}
	}
}
