package 김준연;

public class p235_ConstructorExample {

	public static void main(String[] args) throws Throwable{
		p235_Cat c=new p235_Cat("이쁜이",45);
		p235_Cat c2=new p235_Cat();
		System.out.println(c.toString()+"의 몸무게는 "+c.getSize());
		
		c.finalize();
	}
}

class p235_Cat
{
	int size;
	private String name;
	public p235_Cat()
	{
		this("영순이",50);
	}
	public p235_Cat(String n,int s)
	{
		name=n;
		size=s;
	}
	public int getSize() {return size;}
	public String toString() {return name;}
	public void finalize() throws Throwable
	{
		System.out.println(name+" 고양이가 소멸됨");
	}
}