package 김준연;

public class NestTryTest {
	public static void main(String[] args) {
		try
		{
			try
			{
				System.out.println("Inner Try1");
				int b = 5/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Inner Catch1");
			}
			try
			{
				System.out.println("Inner Try2");
				int b = 5/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("Inner Catch2");
			}
		}
		catch(ArithmeticException e3)
		{
			System.out.println("Arithmetic error");
			System.out.println("Outer Catch1");
		}
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println("Array index out of bounds");
			System.out.println("Outer Catch2");
		}
		catch(Exception e5)
		{
			System.out.println("Exception");
			System.out.println("Outer Catch3");
		}
	}
}
