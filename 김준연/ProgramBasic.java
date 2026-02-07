package 김준연;

public class ProgramBasic {
	public static void main(String[] args) {
//		String regExp=" |,|:|\\.";
//		String words="one  two,three:four.five";
//		String newStr=words.replaceAll(regExp, "-");
//		System.out.println(newStr);
		String delimStr=" ";
		String words="minus on    tow,three:four.five";
		String[] split=null;
		split=words.split(delimStr);
		for(String s:split)System.out.println("-"+s+"-");
	}
}
