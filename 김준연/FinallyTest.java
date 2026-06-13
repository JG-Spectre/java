package 김준연;

public class FinallyTest {
	public static void main(String[] args) {
		try
		{
			System.out.println("First statement of try block");
			throw new ArithmeticException();
			//int num = 3.14;
			//System.out.println(num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		finally
		{
			System.out.println("in finally block");
		}
		System.out.println("outer try-catch");
	}
}
