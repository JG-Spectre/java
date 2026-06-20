package 김준연;

public class MultipleCatchTest {
	public static void main(String[] args) {
		try
		{
			int arr[] = new int[5];
			arr[6] = 20/5;
			System.out.println("try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("out of try-catch");
	}
}