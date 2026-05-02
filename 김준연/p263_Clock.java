package 김준연;

import java.util.Date;
import java.util.Calendar;

public class p263_Clock {
	public static void main(String[] args) {
		Clock[] clocks= {
			new Clock(),
			new ForeignClock("Rome",9),
			new ForeignClock("Tokyo",-7)
		};
		for (Clock i : clocks) {System.out.println(i.getLocation()+" : "+i.getHours()+"시 "+i.getMinutes()+"분 "+i.getSeconds()+"초");}
	}
}

class Clock
{
	public String getLocation() {return "한국";}
	int getHours()
	{
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		return hour;
	}
	int getMinutes()
	{
		long time=System.currentTimeMillis();
		Date date=new Date(time);
		int min=date.getMinutes();
		return min;
	}
	int getSeconds()
	{
		Date date=Calendar.getInstance().getTime();
		int sec=date.getSeconds();
		return sec;
	}
}
class ForeignClock extends Clock
{
	String location;
	int timeDiff;
	public String getLocation() {return location;}
	public ForeignClock(String loc,int diff) {location=loc; timeDiff=diff;}
	int getHours()
	{
		int local=super.getHours();
		int tmp=local+timeDiff;
		tmp=(tmp<0)?(24+tmp):tmp;
		return tmp;
	}
}