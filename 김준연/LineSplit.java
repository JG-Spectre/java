package 김준연;

import java.util.Scanner;

public class LineSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 공백으로 구분해서 입력\n>>");
		String statement=sc.nextLine();
		String [] split=null;
		split=statement.split(" ");
		int sum=0;
		for(String s:split) sum+=Integer.parseInt(s);
		System.out.println(sum);
	}
}
