package 김준연;

public class ProgramBasic2 {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("hello");
		System.out.println("Old Capacity = "+str1.capacity());
		str1.ensureCapacity(28);
		System.out.println("New Capacity = "+str1.capacity());
		str1.ensureCapacity(33);
		System.out.println("New Capacity = "+str1.capacity());
		
		StringBuilder str2=new StringBuilder();
		System.out.println("Old Capacity = "+str2.capacity());
		str2.ensureCapacity(40);
		System.out.println("New Capacity = "+str2.capacity());
	}
}
