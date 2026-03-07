package 김준연;

import java.util.Random;

public class ArrayArgument {
	public static void main(String[] args) {
		int[] array=new int[10];
		Random rnd=new Random();
		for(int i=0;i<10;i++) array[i]=rnd.nextInt();
		System.out.println("전 :");
		printArray(array);
		increaseArray(array);
		System.out.println("후 :");
		printArray(array);
	}
	public static void increaseArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) arr[i]++;
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) System.out.println(arr[i]+" ");
		System.out.println();
	}
}
