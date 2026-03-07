package 김준연;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array= {1,5,3,2,4};
		for(int e:array)
			System.out.println(e+"");
		Arrays.sort(array);
		for(int e:array)
			System.out.println(e+"");
	}
}
