package java_study.day5.calendar;

import java.util.Calendar;
import java.util.Map;

/**
 * 캘린더 클래스는
 * */
public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year + "/" + month + "/" + date);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour + ":" + minute + ":" + second);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(yoil[day] + "요일");
	}

}
