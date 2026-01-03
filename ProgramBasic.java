package 김준연;

public class ProgramBasic {
	public static void main(String[] args) {
//		String str1,str2,str3,str4,str5;
//		char[] charArray= {'I',' ','L','o','v','e',' ','Y','o','u'};
//		str1="Hi, Byeong Man";
//		str2=new String(str1);
//		str3=new String(charArray);
//		str4=new String(charArray,2,4);
//		System.out.println(str1+str2+str3+str4);
//		char[] t=str1.toCharArray();
//		for(int i=0;i<t.length;i++) System.out.print(t[i]);
//		String str="I lobe You";
//		t=str.toCharArray();
//		String Str1=new String("I Love You!!");
//		String Str2=Str1;
//		String Str3=new String("I Love You!!");
//		boolean retVal;
//		retVal=Str1.equals(Str2);
//		System.out.println("Returned Value = "+retVal);
//		retVal=Str1.equals(Str3);
//		System.out.println("Returned Value = "+retVal);
//		String str1=new String("I Love You!!");
//		String str2=str1;
//		String str3=new String("I Love You!!");
//		if(str1.compareTo(str2)==0)System.out.println("Equal");
//		else System.out.println("Not Equal");
//		if(str1.compareTo(str3)>0)System.out.println("Greater");
//		else if(str1.compareTo(str3)<0)System.out.println("Less");
//		else System.out.println("Equal");
//		String str="abcisabcisabc";
//		System.out.println(str.indexOf("abc"));
//		System.out.println(str.indexOf("i"));
//		System.out.println(str.indexOf("i",4));
//		System.out.println(str.lastIndexOf("abc"));
//		System.out.println(str.lastIndexOf('s'));
//		System.out.println(str.lastIndexOf('s',8));
		String regExp=" |,|:|\\.";
		String words="one  two,three:four.five";
		String newStr=words.replaceAll(regExp, "-");
		System.out.println(newStr);
	}
}
