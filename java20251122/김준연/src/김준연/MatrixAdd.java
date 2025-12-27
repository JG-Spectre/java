package 김준연;

import java.util.Random;

public class MatrixAdd {
	public static void main(String[] args) {
		int[][] m1=new int[3][3],m2=new int[3][3],m3=new int[3][3];
		
		initMatrix(m1, m2);
		addMatrix(m1,m2,m3);
		printMatrix(m1);
		System.out.println();
		printMatrix(m2);
		System.out.println("===================");
		printMatrix(m3);
	}

	private static void printMatrix(int[][] m) {
		// TODO Auto-generated method stub
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
	}

	private static void addMatrix(int[][] m1, int[][] m2, int[][] m3) {
		// TODO Auto-generated method stub
		for(int i=0;i<m3.length;i++)
		{
			for(int j=0;j<m3[i].length;j++)
				m3[i][j]=m1[i][j]+m2[i][j];
		}
	}

	private static void initMatrix(int[][] m1, int[][] m2) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				m1[i][j]=rnd.nextInt(100);
				m2[i][j]=rnd.nextInt(100);
			}
		}
	}
}
