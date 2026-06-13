package 김준연;

public class FinallyTest2 {
	public static void main(String[] args) {
		try
		{
			System.out.println("first in try");
//			int num = 5/0;
//			System.out.println(num);
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("arith");
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("out trycatch");
	}
}
