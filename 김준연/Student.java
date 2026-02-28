package 김준연;

public class Student {
	String sname;
	int sid,kor,eng,math;
	void setInfo(String name,int id, int k, int e, int m)
	{
		sname=name;
		sid=id;
		kor=k;
		eng=e;
		math=m;
	}
	double getAverage()
	{
		return (kor+eng+math)/3.0;
	}
	String getinfo()
	{
		return sname+", "+sid+", "+kor+", "+eng+", "+math;
	}
}
