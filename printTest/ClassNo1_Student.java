package printTest;

class Student
{
	private String subject; private int number;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}

public class ClassNo1_Student {
	public static void main(String[] args) {
		Student std=new Student();
		std.setSubject("가나다"); std.setNumber(1234);
		System.out.println("학생의 학번은 "+std.getNumber()+", 학과는 "+std.getSubject());
	}
}
