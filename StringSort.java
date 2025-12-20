package 김준연;

import java.util.Scanner;

public class StringSort {
	public static void main(String[] args) {
		final int CNT=5;
		String[] array=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<CNT;i++)
		{
			System.out.println("이름 >>");
			array[i]=sc.next();
		}
		System.out.println("정렬 전 이름 >>");
		for(int i=0;i<CNT;i++) System.out.println(array[i]+" ");
		System.out.println();
		String temp;
		int leastIndex;
		for(int i=0;i<CNT-1;i++)
		{
			leastIndex=i;
			for(int j=i+1;j<CNT;j++)
			{
				if(array[j].compareTo(array[leastIndex])<0) leastIndex=j;
			}
			temp=array[i];
			array[i]=array[leastIndex];
			array[leastIndex]=temp;
		}
		System.out.println("정렬 후 이름 >>");
		for(int i=0;i<CNT;i++) System.out.println(array[i]+" ");
		System.out.println();
		sc.close();
	}
}
