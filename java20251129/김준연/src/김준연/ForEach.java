package 김준연;

public class ForEach {
	public static void main(String[] args)
	{
		int[] array= {88,67,56,77,99,90,44};
		double avg;
		int max=0,min=100,sum=0;
		for (int number : array)
		{
			sum += number;
			if(number>max) max=number;
			if(number<min)min=number;
		}
		avg=((double)sum)/array.length;
		System.out.println("avg "+avg);
		System.out.println("max "+max);
		System.out.println("min "+min);
	}
}
