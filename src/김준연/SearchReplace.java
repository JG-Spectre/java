package 김준연;

import java.util.Scanner;

public class SearchReplace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문장 입력\n>>");
		String statement=sc.nextLine();
		System.out.print("찾으려는 단어\n>>");
		String sword=sc.next();
		System.out.print("덮어씌울 단어\n>>");
		String rword=sc.next();
		statement=statement.replaceFirst(sword, rword);
		System.out.println(statement);
	}
}
