package 김준연;

import java.util.Random;

class SharedData
{
	private static int count=0;
	public final static int MaxSize=100;
	private static int[] buffer=new int[MaxSize];
	public static int getVal()
	{
		if(count!=0)
			return buffer[--count];
		else
			return -1;
	}
	public static int setVal(int s)
	{
		if(count!=MaxSize)
		{
			buffer[count++]=s;
			return count;
		}
		else
			return -1;
	}
}

class Producer
{
	private Random generator=new Random();
	public void produce()
	{
		int loop=generator.nextInt(4)+2;//5
		int res,val;//6
		for(int i=0;i<loop;i++)//7
		{
			val=generator.nextInt(101);//8
			res=SharedData.setVal(val);//9
			if(res<0)//10
				System.out.println("write : 버퍼가 꽉 차 데이터를 추가할 수 없습니다.");//11
			else//11
				System.out.println("write : "+val);//12
		}
	}
}

class Consumer//2
{
	private Random generator=new Random();//3
	public void consume()//4
	{
		int loop=generator.nextInt(4)+2;
		int res;
		for(int i=0;i<loop;i++)//32
		{
			res=SharedData.getVal();
			if(res<0)//30
				System.out.println("read : 데이터가 없습니다.");//31
			else//31
				System.out.println("read : "+res);//32
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
			c.consume();
		}
	}
}
