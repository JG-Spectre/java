package 김준연;

interface Greeting
{
	String message();
}

public class AnonymousTest2 {
	public void display(Greeting g)
	{
		System.out.println(g.message());
	}
	
	public static void main(String[] args) {
		AnonymousTest2 ob = new AnonymousTest2();
		//ob.display(new Greeting() {public String message() {return "안녕하세요";}});
		
		ob.display(new Greeting() {
			
			@Override
			public String message() {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}
