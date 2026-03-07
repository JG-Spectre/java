package 김준연;

public class MyApp {

	public static void main(String[] args) {
		MyInteger ob1=new MyInteger(),ob2=new MyInteger(),ob3=new MyInteger();
		ob1.val=3;ob2.val=5;ob3.val=10;
		int x=ob1.add(ob3);
		System.out.println("결과 1 : "+x);
		int y=ob2.add(ob3);
		System.out.println("결과 2 : "+y);
		int z=ob3.subtract(ob2);
		System.out.println("결과 3 : "+z);
		int a=ob1.multiply(ob2);
		System.out.println("결과 4 : "+a);
		double b=ob3.divide(ob2);
		System.out.println("결과 5 : "+b);
	}
}
