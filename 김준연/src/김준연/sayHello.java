package 김준연;

import java.util.Scanner;

public class sayHello {
	public static void main(String[] args)
	{
		System.out.println("이름 입력 >> ");
		Scanner sc = new Scanner (System.in);
		String name = sc.next();
		sc.close();
		String helloMessage = "안녕하세요. " + name + "님, 자바 세계에 오신 것을 축하드립니다.";
		System.out.println(helloMessage);
	}
}
