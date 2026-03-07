package 김준연;

import java.util.Scanner;

public class SearchReplace3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문장 입력\n>>");
		StringBuilder statement=new StringBuilder(sc.nextLine());
		System.out.print("찾으려는 단어\n>>");
		String sword=sc.next();
		System.out.print("바꾸려는 단어\n>>");
		String rword=sc.next();
		
		int start=statement.indexOf(sword);
		int end=start+sword.length();
		statement.replace(start, end, rword);
		System.out.println(statement);
	}
}
