package 김준연;

interface MyInterface
{
	public void test();
}

class MyClass implements MyInterface
{
	public void test()
	{
		System.out.println("테스트용");
	}
}

public class AnonymousTest {
	public static void main(String[] args) {
		MyInterface inner = new MyInterface()
		{
			public void test()
			{
				System.out.println("테스트용");
			}
		};
		inner.test();
//		MyClass inner = new MyClass();
//		inner.test();
	}
}
