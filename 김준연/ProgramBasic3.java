package 김준연;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramBasic3 {

	public static void main(String[] args) {
		String input="나의 살던 고향은 꽃 피는 산골 봉숭아 꽃 살구 꽃";
		Pattern p=Pattern.compile("(꽃|고향|산골)");
		Matcher m=p.matcher(input);
		while(m.find())
		{
			System.out.println(m.start()+"에서부터 "+(m.end()-1)+"까지 "+m.group()+" 발견");
		}
	}
}
