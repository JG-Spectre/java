package 김준연;

public class ChildParent {
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.print();
	}
}

class ParentClass
{
	public void print() {System.out.println("부모 클래스의 print()");}
}
class ChildClass extends ParentClass
{
//	private int data;
	@Override
	public void print()
	{
		super.print();
		System.out.println("자식 클래스의 print()");
	}
}